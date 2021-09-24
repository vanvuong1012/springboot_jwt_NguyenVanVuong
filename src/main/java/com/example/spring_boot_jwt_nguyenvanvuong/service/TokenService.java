package com.example.spring_boot_jwt_nguyenvanvuong.service;


import com.example.spring_boot_jwt_nguyenvanvuong.entity.Token;

public interface TokenService {
    Token createToken(Token token);
}
