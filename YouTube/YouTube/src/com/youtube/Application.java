package com.youtube;

import java.util.Scanner;

import com.youtube.controller.YouTubeController;
import com.youtube.model.vo.Channel;
import com.youtube.model.vo.Member;

public class Application {
	
	private Scanner sc = new Scanner(System.in);
	private YouTubeController yc = new YouTubeController();
	
	
	public static void main(String[] args) {

		Application app = new Application();
//		app.register();
//	    app.login();
	    app.addChannel();
		
	}

	public void register() {
		//회원가입
		System.out.print("아이디 입력: ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력: ");
		String password = sc.nextLine();
		System.out.print("닉네임 입력: ");
		String nickname = sc.nextLine();
		
		Member member = new Member();
		member.setMemberId(id);
		member.setMemberPassword(password);
		member.setMemberNickname(nickname);
		
		if(yc.register(member)) {
			System.out.println("회원가입에 성공하셨습니다~");
		} else {
			System.out.println("회원가입에 실패하였습니다 ㅠㅠ");
		}
		
	}
	
	public void login() {
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : 입력 ");
		String password = sc.nextLine();
		Member member = yc.login(id, password);
		if(member!=null) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
	}
	
	public void addChannel() {
		yc.login("user", "1234");
		System.out.print("채널명 : ");
		String title = sc.nextLine();
		Channel channel = new Channel();
		channel.setChannelName(title);
		if(yc.addChannel(channel)) {
			System.out.println("채널이 추가되었습니다.");
		} else {
			System.out.println("채널 추가 실패 ㅠ");
		}
	}
	
}















