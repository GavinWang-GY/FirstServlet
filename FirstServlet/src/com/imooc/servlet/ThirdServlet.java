package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int i = Integer.parseInt(request.getParameter("n"));
		PrintWriter out = response.getWriter();
		out.println(sum(i));
	}
	public int sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum = sum+i;
		}
		return sum;
	}

}
