package solbin.book.springboot_aws.web.dto;

import lombok.Getter;
import solbin.book.springboot_aws.domain.posts.Posts;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.author = entity.getAuthor();
        this.content = entity.getContent();
        this.id = entity.getId();
        this.title = entity.getTitle();
    }
}
