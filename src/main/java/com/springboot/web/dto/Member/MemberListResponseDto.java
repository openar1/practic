package com.springboot.web.dto.Member;

import com.springboot.domain.member.Member;
import lombok.Getter;

import java.util.Date;

@Getter
public class MemberListResponseDto {
    private String id;
    private String name;
    private String password;
    private String company;
    private String position;
    private String phone;
    private String mobile;
    private Date joindate;




    public MemberListResponseDto(Member entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.password = entity.getPassword();
        this.company = entity.getCompany();
        this.position = entity.getPosition();
        this.phone = entity.getPhone();
        this.mobile = entity.getMobile();
        this.joindate = entity.getJoindate();


    }
}
