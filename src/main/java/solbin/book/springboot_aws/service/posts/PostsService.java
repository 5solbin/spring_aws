package solbin.book.springboot_aws.service.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import solbin.book.springboot_aws.domain.posts.Posts;
import solbin.book.springboot_aws.domain.posts.PostsRepository;
import solbin.book.springboot_aws.web.dto.PostsResponseDto;
import solbin.book.springboot_aws.web.dto.PostsSaveRequestDto;
import solbin.book.springboot_aws.web.dto.PostsUpdateRequestDto;

@Service
@RequiredArgsConstructor
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(
                () ->  new IllegalArgumentException("해당 게시글이 없습니다. id = " + id)
        );
        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(
                () ->  new IllegalArgumentException("해당 게시글이 없습니다. id = " + id)
        );

        return new PostsResponseDto(entity);
    }
}
