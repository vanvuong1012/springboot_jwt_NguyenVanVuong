package com.example.spring_boot_jwt_nguyenvanvuong.repository;

import com.example.spring_boot_jwt_nguyenvanvuong.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}
