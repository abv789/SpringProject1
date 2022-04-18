package com.example.controller;

import com.example.dto.MemberDTO;
import com.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    @Autowired
    private MemberService memberService;

    @RequestMapping("/home")
    public String home(){

        return "homepage";
    }

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/loginForm")
    public String loginForm(){

        return "loginForm";
    }
    //해당 url/id 값으로 요청이 들어오면 loginResultView 메소드 실행
    @RequestMapping("/loginResultView/{id}")
    public String loginTestResult(@PathVariable String id, Model model){

        MemberDTO dto = memberService.selectMember(id);

        model.addAttribute("member", dto);

        return "loginResultView";
    }
}
