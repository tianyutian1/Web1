package com.NewNews;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class ArticleTag implements Tag {
	private PageContext pc;
	private String sortid;

	public int doEndTag() throws JspException {
		// TODO �Զ����ɷ������
		return 0;
	}

	public int doStartTag() throws JspException {
		JspWriter out = pc.getOut();
		DAO db = new DAO();
		Vector v = db.SeachArticleFromSortID(sortid);
		for (int i = 0; i < v.size(); i++) {
			Vector temp = (Vector)v.get(i);
			
			try {
				out.print("<tr id='"+temp.get(0)+"'>");
				out.print("<td colspan='3'>");
				out.print("<table width='550' border='1'>");
				out.print("<tr>");
				out.print("<td width='151' height='34' valign='middle' class='STYLE3'><div align='center'>");
				out.print(temp.get(1));
				out.print("</div></td>");
				out.print("<td width='133'><div align='center' class='STYLE3'>");
				out.print(temp.get(2));
				out.print("</div></td>");
				out.print("<td width='215'><div align='center' class='STYLE3'>");
				out.print("<input  type='button' value='ɾ��' onclick='delArticle("+temp.get(0)+")'/>&nbsp; &nbsp; &nbsp; &nbsp;");
				out.print("<input id=b"+temp.get(0)+" type='button' value='��ʾ' onclick='showArticle("+temp.get(0)+")'/>");
				out.print("</div></td>");
				out.print("</tr>");
				out.print("</table>");
				out.print("</td>");
				out.print("</tr>");
			} catch (IOException e) {
				// TODO �Զ����� catch ��
				e.printStackTrace();
			}
			
		}
		return 0;
	}
	public Tag getParent() {
		// TODO �Զ����ɷ������
		return null;
	}

	public void release() {
		// TODO �Զ����ɷ������

	}

	public void setPageContext(PageContext arg0) {
		pc = arg0;

	}

	public void setParent(Tag arg0) {
		// TODO �Զ����ɷ������

	}

	public String getSortid() {
		return sortid;
	}

	public void setSortid(String sortid) {
		this.sortid = sortid;
	}

}
