package solbin.book.springboot_aws.web.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() throws Exception{
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertEquals(name, dto.getName());
        assertEquals(amount, dto.getAmount());
    }

}