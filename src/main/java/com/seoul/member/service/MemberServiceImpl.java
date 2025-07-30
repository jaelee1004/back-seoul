package com.seoul.member.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.seoul.member.dao.MemberDAO;
import com.seoul.member.dto.Member;

@Service
public class MemberServiceImpl implements MemberService {

	MemberDAO memberDAO;

	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public Member findMember(Member member) throws SQLException {
		return memberDAO.selectLogin(member);
	}

}
