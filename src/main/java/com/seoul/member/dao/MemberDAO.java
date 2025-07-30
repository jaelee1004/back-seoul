package com.seoul.member.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.seoul.member.dto.Member;


@Mapper
public interface MemberDAO {
    public Member selectLogin(Member member)throws SQLException;
}
