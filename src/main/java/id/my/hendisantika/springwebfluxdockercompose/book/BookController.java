package id.my.hendisantika.springwebfluxdockercompose.book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/16/24
 * Time: 08:02
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/books")
public record BookController(BookService bookService) {
}
