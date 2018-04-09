package com.liwei2018.liwei0404;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by dell on 2018/4/9.
 */
public class DemoMethodInterceptor implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("brfore in cglib");
        Object result = null;
        try{
            result = methodProxy.invokeSuper(o,objects);
        }
        catch (Exception e ){
            System.out.println("error");
        }finally {
            System.out.println("after in cglib");
        }
        return result;
    }
}
