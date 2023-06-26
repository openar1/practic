package com.springboot.service.member;

import com.springboot.domain.member.Member;
import com.springboot.domain.member.MemberRepository;
import com.springboot.web.dto.Member.MemberListResponseDto;
import com.springboot.web.dto.Member.MemberResponseDto;
import com.springboot.web.dto.Member.MemberSaveRequestDto;
import com.springboot.web.dto.Member.MemberUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    @Transactional
    public String save(MemberSaveRequestDto requestDto){
        return memberRepository.save(requestDto.toEntity()).getId();
    }
    @Transactional
    public String update(String id, MemberUpdateRequestDto requestDto){
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 회원정보가 없어. id= "+ id));
        member.update(requestDto.getPassword(), requestDto.getCompany(), requestDto.getMobile(),requestDto.getPhone(), requestDto.getPosition());
        return id;
    }

    @Transactional
    public void delete(String id){
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 회원정보가 없어. id= "+ id));
        memberRepository.delete(member);
    }

//    @Transactional(readOnly = true)
//    public List<MemberListResponseDto> findAllDesc(){
//        return memberRepository.findAllDesc().stream()
//                .map(MemberListResponseDto::new)
//                .collect(Collectors.toList());
//    }

    public MemberResponseDto findById(String id){
        Member entity = memberRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 게시글 없어 id=" + id));

        return new MemberResponseDto(entity);
    }
}
