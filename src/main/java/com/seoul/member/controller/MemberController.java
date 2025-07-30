package com.seoul.member.controller;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seoul.member.dto.Member;
import com.seoul.member.service.MemberService;


@RestController
@CrossOrigin("*")
@RequestMapping("/member")
public class MemberController {

	MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	//멤버 존재유무
	@PostMapping("/findMember")
	public Member findMember(@RequestBody Member member) throws SQLException {
	    return memberService.findMember(member);
	}
}







