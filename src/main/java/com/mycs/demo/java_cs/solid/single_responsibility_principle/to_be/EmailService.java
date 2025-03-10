package com.mycs.demo.java_cs.solid.single_responsibility_principle.to_be;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmail(String email) {
        // 이메일 전송 로직
        System.out.println("이메일 전송: " + email);
    }
}
