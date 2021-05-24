package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.MemberService;
import com.dev.vo.MemberVO;

public class MemberSearchController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//parameter 추출
		String id = request.getParameter("id");
		String job = request.getParameter("job");
		String path = null;
		
		if(job.equals("search"))
			path = "/result/memberSearch.jsp";
		else if(job.equals("update"))
			path = "/result/memberUpdate.jsp";
		else if(job.equals("delete"))
			path = "/result/memberDelete.jsp";
		
		//service MemberVO
		MemberService service = MemberService.getInstance();
		MemberVO member = service.memberSearch(id);
		
		if(member == null)request.setAttribute("result", "NO ID!!");
		request.setAttribute("member", member);
		if(job.equals("search")) path="/result/memberSearchOutput.jsp";
		HttpUtil.forward(request, response, path);
		
		
	}

}
