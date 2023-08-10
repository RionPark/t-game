package com.game;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RenameTest {


	private static final List<Map<String,String>> MOCK_LIST;
	static {
		MOCK_LIST = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			Map<String,String> map = new HashMap<>();
			map.put("name", "이름1");
			map.put("age", i+"살");
			map.put("address", "서울 어딘가");
		}
		System.out.println("1");
	}
	public RenameTest() {
		System.out.println("2");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(MOCK_LIST);
		System.out.println("뭔가 함");
	}
	public static void main(String[] args) throws ServletException, IOException {
		RenameTest rt = new RenameTest();
		rt.doGet(null, null);
	}
}
