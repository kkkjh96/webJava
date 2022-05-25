package sec04.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewMembers")
public class ViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
		                                            throws ServletException, IOException {
	      request.setCharacterEncoding("utf-8");		
	      response.setContentType("text/html;charset=utf-8");
	      PrintWriter out=response.getWriter();
	      List membersList = (List) request.getAttribute("membersList");
	      out.print("<html><body>");
	      out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
	      out.print("<td>���̵�</td><td>��й�ȣ</td><td>�̸�</td><td>�̸���</td><td>������</td><td >����</td></tr>");
	      for (int i = 0; i < membersList.size(); i++) {
	    	  MemberVO memberVO = (MemberVO) membersList.get(i);
	    	  String id = memberVO.getId();
	    	  String pwd = memberVO.getPwd();
	    	  String name = memberVO.getName();
	    	  String email = memberVO.getEmail();
	    	  Date joinDate = memberVO.getJoinDate();
	    	  out.print("<tr><td>" + id + "</td><td>" + pwd + "</td><td>" + name + "</td><td>" + email + "</td><td>"
					+ joinDate + "</td><td>" + "<a href='/pro08/member3?command=delMember&id=" + id
					+ "'>���� </a></td></tr>");

		}
		out.print("</table></body></html>");
		out.print("<a href='/pro08/memberForm.html'>�� ȸ�� ����ϱ�</a");
	}
}
