package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class loginServlet2 extends HttpServlet {
		
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");

		String data = "<html>";
			data += "<body>";
			data += "���̵� : " + id;
			data += "<br>";
			data += "�н����� : " + pw;
			data += "</body>";
			data += "</html>";
		out.print(data);
		
	}
	
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}

}