package com.springboot.web.dto.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public class MemberUpdateRequestDto {
    private String password;
    private String company;
    private String position;
    private String phone;
    private String mobile;

    @Builder
    public MemberUpdateRequestDto(String password, String company, String position, String phone, String mobile){
        this.password= password;
        this.company =company;
        this.position =position;
        this.phone =phone;
        this.mobile =mobile;

    }
}
