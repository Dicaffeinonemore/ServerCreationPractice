package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Log4j2
@Controller
// 클래스의 url경로 설정
@RequestMapping("/todo")
public class TodoController {
    // 메소드의 uri 경로 설정, 메소드 설정을 생략하면 Get 메소드로 실행
    @RequestMapping("/list")
    public void list(){
        log.info("list");
    }
    @RequestMapping(value ="/register", method=RequestMethod.GET)
    public void register(){
        log.info("todo register..................");
    }
    // POST 메소드를 실행할 경우 method=RequestMethod.POST로 설정해야 합니다.
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void registerPost(){
        log.info("todo register post................");
    }
}
