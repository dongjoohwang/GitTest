package unit00;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculateServlet
 */
@WebServlet("/CalculateServlet")
public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int add = n1+n2;
		int half = n1*n2;
		int minus = n1-n2;
		int split = n1/n2;
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println(n1 + "+" + n2 + "=" + add); 
		out.print("<br>");
		out.println(n1 + "x" + n2 + "=" + half);
		out.print("<br>");
		out.println(n1 + "-" + n2 + "=" + minus);
		out.print("<br>");
		out.println(n1 + "/" + n2 + "=" + split);
		out.print("</body></html>");
		out.close();
	}

}
