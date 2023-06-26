package com.springboot.web.member;

import com.springboot.service.member.MemberService;
import com.springboot.web.dto.Member.MemberResponseDto;
import com.springboot.web.dto.Member.MemberSaveRequestDto;
import com.springboot.web.dto.Member.MemberUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@Controller
public class MemberApiController {
    private final MemberService memberService;
    @PostMapping("/api/v1/member")
    public  String save(@RequestBody MemberSaveRequestDto
                      requestDto){
        return memberService.save(requestDto);
    }

    @PutMapping("/api/v1/member/{id}")
    public String update(@PathVariable String id, @RequestBody MemberUpdateRequestDto requestDto){
        return memberService.update(id, requestDto);
    }
    @DeleteMapping("/api/v1/member/{id}")
    public String delete(@PathVariable String id){
        memberService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/member/{id}")
    public MemberResponseDto findById(@PathVariable String id){

        return memberService.findById(id);
    }


    @GetMapping("/member/list")
    public String memberList() {
        return "member-list";
    }

}
