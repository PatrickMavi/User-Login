package com.springboot.blog.payload;

import lombok.Data;

@SuppressWarnings("ALL")
@Data

public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
