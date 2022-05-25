package serial;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serialdata")
public class SerialDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("접속");

		// 1. 데이터를 받는다.
		String data = request.getParameter("data");

		System.out.println("url data : " + data);

		// 받은 데이터를 웹 브라우저로 보내줘야 하는데, 들어온 데이터를 전역 저장소 객체(내장 객체)에 저장한다.
		// 이 서버에 데이터가 저장 된다.
		ServletContext app = request.getServletContext();

		app.setAttribute("data", data);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}