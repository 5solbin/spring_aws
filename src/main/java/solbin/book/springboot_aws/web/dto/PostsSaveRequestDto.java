package solbin.book.springboot_aws.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import solbin.book.springboot_aws.domain.posts.Posts;

@Getter @NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String author, String content, String title) {
        this.author = author;
        this.content = content;
        this.title = title;
    }

    public Posts toEntity() {
        return Posts.builder()
                .author(author)
                .content(content)
                .title(title)
                .build();
    }
}
