package solbin.book.springboot_aws.domain.posts;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import solbin.book.springboot_aws.domain.BaseTimeEntity;
import solbin.book.springboot_aws.web.dto.PostsSaveRequestDto;

@NoArgsConstructor
@Entity
@Getter
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String author, String content, String title) {
        this.author = author;
        this.content = content;
        this.title = title;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
