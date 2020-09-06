package study.querydsl.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserDto {

    private String name;
    private int age;

    public UserDto(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
