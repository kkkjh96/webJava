package sec01.ex01;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class inputServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("UTF-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("���̵�:" + user_id);
		System.out.println("��й�ȣ:" + user_pw);
		String[] subject = request.getParameterValues("subject");
		for (String str : subject)
		{
			System.out.println("������ ����:" + str);
		}
	}
	
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}

}