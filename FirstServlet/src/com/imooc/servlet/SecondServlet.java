package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String sex = request.getParameter("sex");
		String [] specs = request.getParameterValues("spec");// �ⷵ�ص���һ������
				
		PrintWriter out = response.getWriter();  // ������������������getWriter()�������ص���һ��PrintWriter���͵Ķ���
		out.println("<h1>name:"+name+"</h1>");
		out.println("<h1>mobile:"+mobile+"</h1>");
		out.println("<h1>sex:"+sex+"</h1>");
		for(String str:specs) {
			out.println("<h1>spec:"+str+"</h1>");
		}
	}	
}
