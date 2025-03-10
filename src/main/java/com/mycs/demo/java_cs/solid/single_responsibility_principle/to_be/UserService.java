package com.mycs.demo.java_cs.solid.single_responsibility_principle.to_be;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * TO-BE
 * UserService 클래스는 사용자 등록 로직만 담당하고,
 * 이메일 전송 로직은 EmailService 클래스에 위임하여 SRP를 준수하도록 수정한다.
 *
 * */
@Service
@RequiredArgsConstructor
public class UserService {

    private final EmailService emailService;

    public void registerUser(String username, String name, String email) {
        // 사용자 등록 로직
        System.out.println("사용자 등록: " + username + ", " + name + ", " + email);
        emailService.sendEmail(email);
    }
}


