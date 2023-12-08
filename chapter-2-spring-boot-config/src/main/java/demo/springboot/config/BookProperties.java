package demo.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 书属性
 *
 * Created by bysocket on 27/09/2017.
 */
@Component
public class BookProperties {

    /**
     * 书名
     */
    @Value("${demo.book.name}")
    private String name;

    /**
     * 作者
     */
    @Value("${demo.book.writer}")
    private String writer;

    @Value("${demo.book.description}")
    private String description;

    @Value("${user.name}")
    private String userName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDescription() {
        return description;
    }

    public BookProperties setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public BookProperties setUserName(String userName) {
        this.userName = userName;
        return this;
    }
}
