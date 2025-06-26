package solbin.book.springboot_aws.config.auth.dto;

import lombok.Getter;
import solbin.book.springboot_aws.domain.user.User;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.email = user.getEmail();
        this.name = user.getName();
        this.picture = user.getPicture();
    }
}
