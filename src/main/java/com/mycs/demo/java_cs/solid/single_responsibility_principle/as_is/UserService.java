package com.mycs.demo.java_cs.solid.single_responsibility_principle.as_is;


import com.mycs.demo.java_cs.solid.single_responsibility_principle.to_be.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * SRP(Single Responsibility Principle, 단일 책임 원칙)
 * 한 클래스는 하나의 책임만 가져야 한다.
 *
 * AS-IS
 * UserService 클래스는 사용자 관련 로직만 담당해야하지만,
 * 사용자 등록과 이메일 전송 로직을 모두 담당하고 있기 때문에 SRP를 위반하고 있다.
 * */
@Service
@RequiredArgsConstructor
public class UserService {

    public void registerUser(String username, String name, String email) {
        // 사용자 등록 로직
        System.out.println("사용자 등록: " + username + ", " + name + ", " + email);
    }

    public void sendEmail(String email) {
        // 이메일 전송 로직
        System.out.println("이메일 전송: " + email);
    }
}


