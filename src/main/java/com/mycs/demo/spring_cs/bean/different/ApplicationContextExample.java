package com.mycs.demo.spring_cs.bean.different;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 애플리케이션 시작 시 모든 Bean을 즉시 로딩 (즉시 로딩)
 * Spring Boot 애플리케이션에서 기본적으로 사용
 * AnnotationConfigApplicationContext (ApplicationContext로 동작)
 * AOP, 이벤트 처리, 프로파일 관리 등 다양한 기능 제공
 * 애플리케이션 초기화 시 모든 Bean을 로드하여 준비됨
 * */
public class ApplicationContextExample {
    public void runExample() {
        // ApplicationContext 생성 (즉시 로딩 방식)
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Bean을 가져와서 사용
        MyBean myBean = context.getBean(MyBean.class);
        myBean.sayHello();
    }
}
