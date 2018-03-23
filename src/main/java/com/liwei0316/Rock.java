package com.liwei0316;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ObjDoubleConsumer;

/**
 * Created by dell on 2018/3/16.
 */

public class Rock {
    Rock(int i ){
        System.out.println("Rock"+i);
    }
//    class Rock2{
//        Rock2(int i){
//            System.out.println("Rock"+i);
//        }
//    }
    public static void main(String[] args) {
            for(int i=1;i<10;i++){
                new Rock(i);
            }
        Map<String,Object> map = new HashMap<>();
        map.put("test","0316");
    }
}
