package com.NewNews;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import com.jspsmart.upload.SmartUpload;



public class SaveLogo extends HttpServlet {

	private ServletConfig config;
	public SaveLogo() {
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
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("GBK");
//		System.out.println(this.getServletContext().getServletContextName());
//		System.out.println(this.getServletConfig().getServletName());
		String imageName = null;
		SmartUpload myupload = new SmartUpload();
		myupload.initialize(this.getServletConfig(),request,response);
		try {
			myupload.setAllowedFilesList("gif,jpg");//设定允许上传的文件（通过扩展名限制）
			myupload.setMaxFileSize(20000);//设定允许最大上传文件的大小-20000字节(20k)
			myupload.upload();
			myupload.save("images");
			imageName = myupload.getFiles().getFile(0).getFileName();
			//System.out.println(imageName);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		BlogSelf blog = new BlogSelf();
		blog.setImage("images/"+imageName);
		blog.setId(3);
		DAO db = new DAO();
		db.UpdateBlogLogo(blog);
		response.sendRedirect("/BlogOnline/admin/adminLogo.jsp");
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occure
	 */
	public void init() throws ServletException {
		
	}

}
