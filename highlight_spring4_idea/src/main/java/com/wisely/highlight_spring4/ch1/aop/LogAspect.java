package com.wisely.highlight_spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by 307lab-1 on 2017/7/16.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
    public void annotationPointCut() {}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("ע��ʽ���� " + action.name());
    }

    @Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))") //6
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("��������ʽ���أ�" + method.getName());
    }
}
