package com.example.spring_boot_jwt_nguyenvanvuong.service;
import com.example.spring_boot_jwt_nguyenvanvuong.entity.Token;
import com.example.spring_boot_jwt_nguyenvanvuong.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService{
    @Autowired
    private TokenRepository tokenRepository;
    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }
}
