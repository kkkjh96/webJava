package sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;


@WebServlet("/first3")
public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		out.print("<script type='text/javascript'>");
		out.print("location.href='second3';");
		out.print("</script>");
	}

}
