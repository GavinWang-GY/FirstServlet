package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����ҳ������ֵ�ĺ�
 * @author Administrator
 *
 */
public class CaculateServlet extends HttpServlet{
	// service��������ĺ��ķ�����������get����post���ᱻservice()��������
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String methodName = request.getMethod(); // ��ȡ��ǰ����������ʲô��ʽ���ݵ�
		
		int sum = Integer.parseInt(request.getParameter("num1")) + Integer.parseInt(request.getParameter("num2"));	
		PrintWriter out = response.getWriter();
		out.println("Addition calculator��");
		out.println("Calculation results��"+sum);		
		out.println("method is��"+methodName);
	}

}
