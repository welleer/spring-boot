package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/7/6.
 */
@Controller
@ResponseBody
@RequestMapping("/live")
public class HelloController {

    @Autowired
    Girl girl;

//    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    @GetMapping(value = {"/hello","/hi"})
    public String say(@RequestParam(value = "id",required = false, defaultValue = "0") Integer id){
        return id+"_________"+girl.getSize()+">>>hello<<<"+girl.getAge();
    }
//    @RequestMapping(value = {"/{id}/hello","/hi"},method = RequestMethod.GET)
//    public String say(@PathVariable("id") Integer id){
//        return id+"_________"+girl.getSize()+">>>hello<<<"+girl.getAge();
//    }
//    @RestController
//    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
//    public String say2(){
//        return "index";
////        return girl.getSize()+">>>hello<<<"+girl.getAge();
//    }
}
