package com.liwei2018.liwei0408;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dell on 2018/4/8.
 */
public class SwapInteger {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        System.out.println("before----a:"+a+",b:"+b);
        //交换
//        swap(a,b);
        System.out.println("after----a:"+a+",b:"+b);

        int h;
        String key = "liwei";
        System.out.println((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));
        System.out.println("102987421----------------");
        System.out.println("---------------"+ (h = key.hashCode()));
        System.out.println("---------------"+ (h >>> 16));
        System.out.println("---------------");
        System.out.println(1<<2);
        System.out.println(8>>2);

        System.out.println("------------list------------");
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.get(0));
        System.out.println(list.toString());
        System.out.println("------------set------------");
        HashSet<Object> set = new HashSet<>();
        set.add(null);
        set.add(null);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add("3");
//        System.out.println(set);
        System.out.println(set.toString());
        System.out.println("-----------map-------------");
        HashMap<Object, Object> map = new HashMap<>();
        map.put("test",null);
        map.put(null,null);
        map.put(null,null);
        map.put("null",null);
        System.out.println(map.toString());
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
