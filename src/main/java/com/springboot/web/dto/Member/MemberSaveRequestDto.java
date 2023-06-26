package com.springboot.web.dto.Member;

import com.springboot.domain.member.Member;
import com.springboot.domain.member.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class MemberSaveRequestDto {
    private String id;
    private String name;
    private String password;
    private String company;
    private String position;
    private String phone;
    private String mobile;
    private Date joindate;
    private Role role;
    @Builder
    public MemberSaveRequestDto(String id,String name, String password, String company, String position, String phone, String mobile, Date joindate,
                                Role role){
        this.id = id;
        this.name =name;
        this.password =password;
        this.company =company;
        this.position =position;
        this.phone =phone;
        this.mobile =mobile;
        this.joindate =joindate;
        this.role=role;
    }
    public Member toEntity(){
        return Member.builder()
                .id(id)
                .name(name)
                .password(password)
                .company(company)
                .position(position)
                .phone(phone)
                .mobile(mobile)
                .joindate(joindate)
                .role(role)
                .build();
    }
}
