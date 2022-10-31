package com.example.lastdemo.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    private  MessageDTO messageDTO;
    Member findMember;
    boolean check;

    public MessageDTO addNewUser(Member member) {

        check = memberRepository.existsById(member.getmID());
        if(!check){
            memberRepository.save(member);

        }
        messageDTO=new MessageDTO("이미 존재하는 아이디 입니다.",check);
        return messageDTO;
    }

    public boolean login(Member member) {


        check = memberRepository.existsById(member.getmID());

        if (check) {
            findMember = memberRepository.findById(member.getmID()).get();
        }else {
            return false;
        }
        if (!findMember.getmPW().equals(member.getmPW())) {
            return false;
        }else {
            return true;
        }
    }

}
