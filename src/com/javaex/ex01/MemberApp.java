package com.javaex.ex01;

public class MemberApp {
	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setID("jws");
		member1.setName("정우성");
		member1.setPoint(50000);
		
		Member member2 = new Member();
		member2.setID("yjs");
		member2.setName("유재석");
		member2.setPoint(30000);
		
		Member member3 = new Member();
		member3.setID("lhr");
		member3.setName("이효리");
		member3.setPoint(40000);
		
		Member[] members = new Member[] {
			member1, member2, member3,
		};
		
		for(Member member : members) {
			member.showInfo();
		}
		
	}
}
