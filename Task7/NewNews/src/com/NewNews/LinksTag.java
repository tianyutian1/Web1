package com.NewNews;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class LinksTag implements Tag {
	private PageContext pc;
	private String id;
	public int doEndTag() throws JspException {
		// TODO 自动生成方法存根
		return 0;
	}

	public int doStartTag() throws JspException {
		JspWriter out = pc.getOut();
		DAO db = new DAO();
		Vector v = new Vector();
		v = db.SeachLinksFromBlogID(id);
		for (int i = 0; i < v.size(); i++) {
			try {
				out.print("<tr>");
				out.print("<td>");
				out.print(((Vector)v.get(i)).get(1));
				out.print("</td>");
				out.print("<td>");
				out.print(((Vector)v.get(i)).get(2));
				out.print("</td>");
				out.print("<td>");
				out.print("<a href=/BlogOnline/servlet/DeleteLinks?linkid="+((Vector)v.get(i)).get(0)+">");
				out.print("删除</a>");
				out.print("</td>");
				out.print("</tr>");
			} catch (IOException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		}
		return Tag.EVAL_PAGE;
	}

	public Tag getParent() {
		// TODO 自动生成方法存根
		return null;
	}

	public void release() {
		// TODO 自动生成方法存根

	}

	public void setPageContext(PageContext arg0) {
		pc = arg0;

	}

	public void setParent(Tag arg0) {
		// TODO 自动生成方法存根

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
