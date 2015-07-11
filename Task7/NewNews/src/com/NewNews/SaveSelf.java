package com.NewNews;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveSelf extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public SaveSelf() {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("GBK"); // 中文流处理信息

		// String subject = request.getParameter("subject");
		// String psw = request.getParameter("psw");
		// String uname = request.getParameter("uname");
		// String runame = request.getParameter("runame");
		// String six = request.getParameter("six");
		// String age = request.getParameter("age");
		// String works = request.getParameter("work");
		// String[] likes = request.getParameterValues("likes");
		// String email = request.getParameter("email");
		// BlogSelf blog = new BlogSelf();
		// blog.setAge(age);
		// blog.setEmail(email);
		// blog.setId(2);
		// blog.setLikes("不知道");
		// blog.setPassword(psw);
		// blog.setSix(six);
		// blog.setSubject(subject);
		// blog.setUname(uname);
		// blog.setUsername(runame);
		// blog.setWorks(works);
		// DAO db = new DAO();
		// db.UpdateBlogSelf(blog);
		String url = request.getContextPath();
		response.sendRedirect(url + "/admin/adminSelf.jsp");
		// System.out.println(subject);
		// System.out.println(psw);
		// System.out.println(uname);
		// System.out.println(runame);
		// System.out.println(six);
		// System.out.println(age);
		// System.out.println(work);
		// for(int i=0;i<likes.length;i++){
		// System.out.println(likes[i]);
		// }
		// System.out.println(email);

	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occure
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
