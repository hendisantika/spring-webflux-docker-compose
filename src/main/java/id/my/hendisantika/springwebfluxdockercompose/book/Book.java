package id.my.hendisantika.springwebfluxdockercompose.book;

import io.r2dbc.spi.Row;
import io.r2dbc.spi.RowMetadata;

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
public record Book(Long id, String title, String isbn) {

    // Not used in this example
    public static Book fromRow(Row row, RowMetadata metadata) {
        return new Book(
                row.get("id", Long.class),
                row.get("title", String.class),
                row.get("isbn", String.class)
        );
    }
}
