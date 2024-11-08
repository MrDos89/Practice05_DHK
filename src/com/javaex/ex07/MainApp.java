package com.javaex.ex07;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요.");
		
		FriendInfo[] friends = new FriendInfo[3];
		
		for(int i = 0; i < friends.length; ++i) {
			System.out.print("이름: ");
			String tempName = scanner.nextLine();
			
			System.out.print("핸드폰: ");
			String tempPhone = scanner.nextLine();
			
			System.out.print("학교: ");
			String tempSchool = scanner.nextLine();
			
			System.out.print("-----------------------\n");
			FriendInfo friend = new FriendInfo(tempName, tempPhone, tempSchool);
			
			friends[i] = friend;
			friend = null;
		}
		
		for(FriendInfo info: friends) {
			info.showInfo();
		}
		
		scanner.close();
	}	
}
