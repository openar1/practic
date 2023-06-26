package com.springboot.domain.member;

import com.springboot.domain.posts.PostsRepository;
import com.springboot.web.dto.Post.PostsSaveRequestDto;
import com.springboot.web.dto.Post.PostsUpdateRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    /**
     * 멤버 리스트 조회
     * @return 멤버 리스트
     */
    List<Member> findAll();

}
