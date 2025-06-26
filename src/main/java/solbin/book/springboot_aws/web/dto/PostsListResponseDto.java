package solbin.book.springboot_aws.web.dto;

import lombok.Getter;
import solbin.book.springboot_aws.domain.posts.Posts;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.author = entity.getAuthor();
        this.id = entity.getId();
        this.modifiedDate = entity.getModifiedDate();
        this.title = entity.getTitle();
    }
}
