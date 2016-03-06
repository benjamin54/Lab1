package first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet({"/HelloWorld", "/Hello_World"})
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String date = request.getParameter("date");
		String sexe = request.getParameter("sexe");
		
		Cookie cookie1 = new Cookie("nomCookie", nom);
		Cookie cookie2 = new Cookie("prenomCookie", prenom);
		Cookie cookie3 = new Cookie("dateCookie", date);
		Cookie cookie4 = new Cookie("sexeCookie", sexe);

		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		
		PrintWriter out= response.getWriter();

		out.println("<HTML>");
		out.println("<HEAD><TITLE>Our  First Servlet</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H1>Hello World </H1>");
		
		out.println("<table border =1><tr><td>"+nom + "</td> <td>" + prenom + "</td> <td>" + date + "</td>"
				+ "<td>" + sexe + "</td></tr></table>");
		out.println("<a href=\"http://localhost:8080/Lab1/ReadCookie\">ReadCookie</a>");
		out.println("</BODY></HTML>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
