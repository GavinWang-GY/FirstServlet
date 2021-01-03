package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestMethodServlet extends HttpServlet{
	
	// doGet()方法，专用于处理get请求
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		response.getWriter().println("<h1 style='color:green'>"+name+"</h1>");	
	}
	// doPost()方法，专用于处理post请求
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		response.getWriter().println("<h1 style='color:red'>"+name+"</h1>");	
	}
}
