package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by dell on 2018/3/23.
 */
@Component
@Aspect
public class TestAop {
    @Pointcut("execution(public * com.example.controller..*.*(..))")
    public void checkUser(){
        System.out.println("**************The System is Searching Information For You****************");
    }
//
//    @Pointcut("execution(* com.cairh.xpe.snp.org.service.impl.OrgBusinessServiceImpl.*(..))")
//    public void checkAdd(){
//        System.out.println("**************<< Add User >> Checking.....***************");
//    }

    @Before("checkUser()")
    public void beforeCheck(){
        System.out.println(">>>>>>>> 准备搜查用户..........");
    }

    @After("checkUser()")
    public void afterCheck(){
        System.out.println(">>>>>>>>　搜查用户完毕..........");
    }
//
//    @Before("checkAdd()")
//    public void beforeAdd(){
//        System.out.println(">>>>>>>>　增加用户--检查ing..........");
//    }
//
//    @After("checkAdd()")
//    public void afterAdd(){
//        System.out.println(">>>>>>>>　增加用户--检查完毕！未发现异常!..........");
//    }

    //声明环绕通知
    @Around("checkUser()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入方法---环绕通知");
        Object o = pjp.proceed();
        System.out.println("退出方法---环绕通知");
        return o;
    }
}
