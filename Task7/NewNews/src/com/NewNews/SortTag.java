package com.NewNews;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class SortTag implements Tag {
	private String blogid;

	private PageContext p;
	private String delbutton; 
	private int j=0;

	public int doEndTag() throws JspException {
		
		return 0;
	}

	public int doStartTag() throws JspException {
		JspWriter out = p.getOut();
		int k=0;
		DAO db = new DAO();
		Vector v = new Vector();
		v = db.SeachSortFromBlogId(blogid);
		try {
			if(delbutton.equals("yes")){
			for (int i = 0; i < v.size(); i++) {
				Vector temp = (Vector) v.get(i);
				out.print("<tr>");
				out.print("<td>");
				out.print(temp.get(0));
				out.print("</td>");
				out.print("<td>");
				out.print("<input type='button' name='Submit' value='删除' onClick='delsort("
								+ temp.get(1) + ")'>");
				out.print("</td>");
				out.print("</tr>");
			}
			}else if(delbutton.equals("no")){
				for (int i = 0; i < v.size(); i++) {
					if((k+3)%3==0){			
						out.print("<tr >");			
					}
					Vector temp = (Vector) v.get(i);			
					out.print("<td>");
					out.print("<a href=showArticle.jsp?sortid="+temp.get(1)+
							" class='Sortname' target='showA'>");
					out.print(temp.get(0));
					out.print("</a>");
					out.print("</td>");
					if((k+1)%3==0){
						out.print("</tr>");
					}
					k++;
				}
			}else{
				
			}
		} catch (IOException e) {
			e.printStackTrace();
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
		p = arg0;

	}

	public void setParent(Tag arg0) {
		// TODO 自动生成方法存根

	}

	public String getBlogid() {
		return blogid;
	}

	public void setBlogid(String blogid) {
		this.blogid = blogid;
	}

	public String getDelbutton() {
		return delbutton;
	}

	public void setDelbutton(String delbutton) {
		this.delbutton = delbutton;
	}



}
