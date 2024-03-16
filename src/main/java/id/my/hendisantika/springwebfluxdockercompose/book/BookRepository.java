package id.my.hendisantika.springwebfluxdockercompose.book;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/16/24
 * Time: 07:59
 * To change this template use File | Settings | File Templates.
 */
public interface BookRepository extends R2dbcRepository<Book, Long> {
}
