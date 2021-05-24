package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.MemberService;
import com.dev.vo.MemberVO;

public class MemberUpdateController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// parameter 추출
		String id = request.getParameter("id");
		String passwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPwd(passwd);
		member.setName(name);
	

		// Service 객체의 메서드 호출
		MemberService service = MemberService.getInstance();
		service.memberUpdate(member);

		// Output View 페이지로 이동
		request.setAttribute("id", id);
		HttpUtil.forward(request, response, "/result/memberUpdateOutput.jsp");
	}

}
