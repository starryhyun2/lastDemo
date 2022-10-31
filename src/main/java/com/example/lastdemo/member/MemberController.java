package com.example.lastdemo.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/Member")
public class MemberController {

    @Autowired
    private MemberService memberService;
    private MessageDTO messageDTO;



    ///로그인 구현창

    @GetMapping("/Login")
    public String Login() {
        return "Login";
    }

    //
    @PostMapping(path = "/Join")
    public String loginId(Member member){

        if(memberService.login(member)) {
            return "redirect:/";
        }
        return "redirect:Login";
    }

    /////회원 가입

    @GetMapping("/Sign_Up")
    public String Sign_Up() {
        return "Sign_Up";
    }

    // form으로 id,pw,name, 주소를 인자로 받아 ORM JPA를 통해 바로 DB에 저장
    @PostMapping(path = "/add") // Map ONLY POST Requests
    public String addNewUser(Member member,
                             Model model
    ) {

        messageDTO = memberService.addNewUser(member);

        model.addAttribute("name",member);
        if(messageDTO.isCheck()){
            return "Welcome";
        }else{
            return messageDTO.getMessage();
        }
    }

/*    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Member> getAllUsers() {
        // This returns a JSON or XML with the users
        return memberRepository.findAll();
    }*/


}
