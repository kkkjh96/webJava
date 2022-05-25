package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/sess")
public class SessionTest extends HttpServlet {
	
	protected void doGet(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		out.println("���� ���̵� : " + session.getId() + "<br>");
		out.println("���� ���� ���� �ð� : " + new Date (session.getCreationTime()) + "<br>");
		out.println("�ֱ� ���� ���� �ð� : " + new Date (session.getLastAccessedTime()) + "<br>");
		out.println("���� ��ȿ �ð� : " + session.getMaxInactiveInterval() + "<br>");
		if(session.isNew()) {
			out.print("�� ������ ����������ϴ�.");
		}
	}
}
