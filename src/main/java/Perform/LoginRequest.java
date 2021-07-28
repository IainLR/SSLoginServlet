package Perform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRequest
 */
@WebServlet("/LoginRequest")
public class LoginRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = null;
		try {
			out = response.getWriter();
			String name = request.getParameter("t1");
			String passwordString = request.getParameter("t2");
			out.println("<center>");
			if (name.toLowerCase().equals("iainlr") && passwordString.equals("asdf")) {
				out.println("<font color = green>" + "Welcome " + name);
			} else {
				out.println("<font color = red>" + "Incorrect credentials");
//				out.println(name + ", " + passwordString);
			}
		} catch (Exception e) {
			// TODO: handle exception
			out.println("Error: " + e.getMessage());
		}

	}

}
