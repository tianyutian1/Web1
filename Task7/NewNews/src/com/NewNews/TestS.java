package com.NewNews;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestS extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public TestS() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/xml");
		//System.out.println(request.getParameter("sortid"));
		PrintWriter out = response.getWriter();
		String id = (String)this.getServletContext().getAttribute("id");
		System.out.println(id);
		out.print("<response>");
		out.print("<id>"+id+"</id>");		
		out.print("</response>");
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("xyz");
		if(!id.equals("")){
		this.getServletContext().removeAttribute("id");
		this.getServletContext().setAttribute("id", id);
		System.out.println(this.getServletContext().getAttribute("id"));
		response.sendRedirect("/BlogOnline/test1.jsp");
		}else{
			
			response.sendRedirect("/BlogOnline/test1.jsp");
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occure
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
