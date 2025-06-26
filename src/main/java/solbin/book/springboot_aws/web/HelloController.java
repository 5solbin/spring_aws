package solbin.book.springboot_aws.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import solbin.book.springboot_aws.web.dto.HelloResponseDto;

@RestController// 컨트롤러를 Json으로 반환하는 컨트롤러로 만들어 준다.
// @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용하게 해준다. >> 뷰 리졸버 동작 x
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
