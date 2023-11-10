package org.example.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoginAspect {
//    @Before("execution(* *..*.*(..))")
////    @Before("execution(public int addNumberToMagicNumberFromDb(..))")
//    public void log(){
//        System.out.println("before logging aspect");
//    }
    @Around("execution(* *..*.*(..))")
//    @Around("@annotation(org.example.Aspects.CustomLog)")
//    @Before("execution(public int addNumberToMagicNumberFromDb(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long t1=System.currentTimeMillis();
        System.out.println("before logging aspect"+proceedingJoinPoint.getSignature());
        Object o=proceedingJoinPoint.proceed();
        long t2=System.currentTimeMillis();
        System.out.println("after logging aspect"+proceedingJoinPoint.getSignature());
        System.out.println("time of "+proceedingJoinPoint.getSignature()+(t2-t1));
        return o;
    }
}
