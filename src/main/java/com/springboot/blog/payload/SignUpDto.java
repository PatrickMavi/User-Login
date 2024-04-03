package com.springboot.blog.payload;

import lombok.Data;

@SuppressWarnings("ALL")
@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
