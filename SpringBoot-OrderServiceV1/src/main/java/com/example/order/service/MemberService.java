package com.example.order.service;

import org.springframework.stereotype.Service;

import com.example.order.model.member.Member;
import com.example.order.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberService {

	private final MemberRepository memberRepository;

	// 회원정보 검색
	public Member findMemberById(String member_id) {
		return memberRepository.findMemberById(member_id);
	}

	// 회원가입
	public void saveMember(Member member) {
		// 아이디 중복 확인
		
		// 회원가입 
		memberRepository.saveMember(member);
	}
}
