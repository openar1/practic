package com.springboot.domain.member;

import com.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Member extends BaseTimeEntity {

    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column()
    private String company;

    @Column()
    private String position;

    @Column()
    private String phone;

    @Column(nullable = false)
    private String mobile;

    @Column(nullable = false)
    private Date joindate;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public Member(String id, String name, String password, String company, String position, String phone, String mobile, Date joindate,
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

    public void update(String password, String company, String position, String phone, String mobile){
        this.password= password;
        this.company =company;
        this.position =position;
        this.phone =phone;
        this.mobile =mobile;
    }

    public String getRoleKey(){
        return this.role.getKey();
    }
}
