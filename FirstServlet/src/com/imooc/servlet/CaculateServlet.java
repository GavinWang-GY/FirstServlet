package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 计算页面输入值的和
 * @author Administrator
 *
 */
public class CaculateServlet extends HttpServlet{
	// service是请求处理的核心方法，无论是get或者post都会被service()方法处理
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String methodName = request.getMethod(); // 获取当前的请求是以什么方式传递的
		
		int sum = Integer.parseInt(request.getParameter("num1")) + Integer.parseInt(request.getParameter("num2"));	
		PrintWriter out = response.getWriter();
		out.println("Addition calculator：");
		out.println("Calculation results："+sum);		
		out.println("method is："+methodName);
	}

}
