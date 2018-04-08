package com.liwei2018.liwei0408;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by dell on 2018/4/8.
 */
public class SwapInteger {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        System.out.println("before----a:"+a+",b:"+b);
        //交换
        swap(a,b);
        System.out.println("after----a:"+a+",b:"+b);
    }

    private static void swap(Integer a, Integer b) {
        try {
            Field field = Integer.class.getDeclaredField("value");
            field.setAccessible(true); //取消访问修饰符
            //public final class Field extends AccessibleObject implements Member
            //值为 true 则指示反射的对象在使用时应该取消 Java语言访问检查。
            //值为 false 则指示反射的对象应该实施 Java语言访问检查。
            //修改常量（final）
//            Field modifiersField = Field.class.getDeclaredField("modifiers");
//            modifiersField.setAccessible(true);
//            modifiersField.setInt(field, field.getModifiers() & Modifier.FINAL);
            //交换
            int temp = b;
            field.set(b, a);
            field.set(a, new Integer(temp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
