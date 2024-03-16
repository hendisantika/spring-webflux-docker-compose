package id.my.hendisantika.springwebfluxdockercompose.book;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/16/24
 * Time: 08:00
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final ReactiveRedisTemplate<String, Book> reactiveRedisTemplate;

    public Mono<Book> findById(Long id) {
        String key = "book:" + id;
        return reactiveRedisTemplate.opsForValue().get(key)
                .switchIfEmpty(bookRepository.findById(id)
                        .flatMap(book -> reactiveRedisTemplate.opsForValue()
                                .set(key, book, Duration.ofMinutes(5))
                                .thenReturn(book))
                );
    }

    public Flux<Book> findAll() {
        return reactiveRedisTemplate.keys("book:*")
                .flatMap(key -> reactiveRedisTemplate.opsForValue().get(key))
                .switchIfEmpty(bookRepository.findAll()
                        .flatMap(book -> reactiveRedisTemplate.opsForValue()
                                .set("book:" + book.id(), book, Duration.ofMinutes(5)))
                        .thenMany(reactiveRedisTemplate.keys("book:*")
                                .flatMap(key -> reactiveRedisTemplate.opsForValue().get(key)))
                );
    }

    public Mono<Book> save(Book book) {
        return bookRepository.save(book)
                .flatMap(savedBook -> reactiveRedisTemplate.opsForValue()
                        .set("book:" + savedBook.id(), savedBook, Duration.ofMinutes(5)).thenReturn(savedBook));
    }
}
