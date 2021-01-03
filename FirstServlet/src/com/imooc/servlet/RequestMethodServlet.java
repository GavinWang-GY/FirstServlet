package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestMethodServlet extends HttpServlet{
	
	// doGet()������ר���ڴ���get����
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		response.getWriter().println("<h1 style='color:green'>"+name+"</h1>");	
	}
	// doPost()������ר���ڴ���post����
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		response.getWriter().println("<h1 style='color:red'>"+name+"</h1>");	
	}
}
