package com.kh.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.dao.BookDAO;
import com.kh.model.vo.Book;
import com.kh.model.vo.Member;
import com.kh.model.vo.Rent;

public class BookController {

	private BookDAO dao = new BookDAO();
	private Member member = new Member();
	
	// 전체 책 조회, 책 등록, 책 삭제
	public ArrayList<Book> printBookAll(){
		
		try {
			ArrayList<Book> list = new ArrayList<>();
			dao.printBookAll();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean registerBook(Book book) {
		
		int result;
		try {
			result = dao.registerBook(book);
			
			if(result ==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean sellBook(int no) {
		
		int result;
		try {
			result = dao.sellBook(no);
			
			if(result == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	// 회원가입, 로그인, 회원탈퇴
	public boolean registerMember(Member member) {
		
		try {
			int result = dao.registerMember(member);
			
			if(result ==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public Member login(String id, String password) {
		
		try {
			member = dao.login(id, password);
			return member;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean deleteMember() {
		// 로그인때 위 member에 따로 담아놔서 매개변수 안받음
		try {
			int result = dao.deleteMember(member.getMemberId(), member.getMemberPwd());
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	// 책 대여, 대여 취소, 내가 대여한 책 조회
	public boolean rentBook(int no) {
		
		ArrayList<Book> list = new ArrayList<>();
		try {
			list = dao.printBookAll();
			Book book = new Book();
			book = list.get(no);
			
			Rent rent = new Rent();
			rent.setBook(book);
			rent.setMember(member);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteRent(int no) {
		
		int result;
		try {
			result = dao.deleteRent(no);
			
			if(result ==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<Rent> printRentBook(){
		
		ArrayList<Rent> list = new ArrayList<>();
		
		try {
			list = dao.printRentBook(member.getMemberId());
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}