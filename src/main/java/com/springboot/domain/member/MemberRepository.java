package com.springboot.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,String> {

//    Optional<Member> findByEmail(String email);

//    @Query("SELECT p FROM Member p ORDER BY p.id DESC")
//    List<Member> findAllDesc();
}
