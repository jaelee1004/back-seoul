package com.seoul.member.service;

import java.sql.SQLException;

import com.seoul.member.dto.Member;


public interface MemberService {

	//멤버 존재유무(로그인에 사용)
    public Member findMember(Member member)throws SQLException;
}
