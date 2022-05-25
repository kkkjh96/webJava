package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/set")
public class SetCookieValue extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Date d = new Date();
		Cookie c = new Cookie("cookieTest" , URLEncoder.encode("JSP���α׷����Դϴ�.", "utf-8"));
		
		//c.setMaxAge(24*60*60);
		c.setMaxAge(-1);
		response.addCookie(c);
		out.println("����ð� : " + d);
		out.println("���ڿ��� Cookie�� �����մϴ�.");
	}

}
