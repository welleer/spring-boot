package com.example.controller;

import com.example.redis.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

/**
 * Created by dell on 2017/7/6.
 */
@Controller
@ResponseBody
@RequestMapping("/redis")
public class RedisController {
    private static Jedis redis = null;

    //    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    @GetMapping(value = {"/set"})
    public String setRedis(@RequestParam(value = "key",required = false) String key,
                           @RequestParam(value = "value",required = false) String value){
        redis = RedisUtil.getJedis();
        redis.set(key,value);
        return key+"_________"+value;
    }
    //    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    @GetMapping(value = {"/get"})
    public String getRedis(@RequestParam(value = "key",required = false) String key){
        redis = RedisUtil.getJedis();
        String value =redis.get(key);
        return key+"_________"+value;
    }
}
