package com.mycs.demo.spring_cs.bean.different;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanFactory 방식
 * getBean() 호출 시점에 Bean을 로딩 (지연 로딩)
 * 리소스가 제한된 환경에서 주로 사용
 * AnnotationConfigApplicationContext (BeanFactory로 동작)
 * 기본적인 의존성 주입, Bean 관리
 * getBean() 호출 시점에 Bean을 가져옴
 * */
public class BeanFactoryExample {
    public void runExample() {
        // BeanFactory로 ApplicationContext 생성 (AnnotationConfig 방식)
        BeanFactory factory = new AnnotationConfigApplicationContext(AppConfig.class);

        // Bean을 가져와서 사용
        MyBean myBean = (MyBean) factory.getBean(MyBean.class);
        myBean.sayHello();
    }
}
