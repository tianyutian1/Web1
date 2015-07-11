package com.NewNews;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.Vector;

public class DAO {

	public void InsertUser() { // �����û�

	}

	/*--------------------------------------�ֽ���--------------------------------------*/
	public void InsertFeedback() { // ��������

	}

	/*--------------------------------------�ֽ���--------------------------------------*/
	public void InsertArticle() { // ��������

	}
	
	/*--------------------------------------�ֽ���--------------------------------------*/
	public void InsertLinksForBlogId(LinksBean lb){  //����blogid��ѯ��������
		String url = "insert into links values('"+lb.getName()+"','"+lb.getUrl()+
		"',"+lb.getBlogid()+")";
		DBcon db = new DBcon();
		// System.out.println(url);
			try {
				Connection con = db.getCon();
				Statement stmt = con.createStatement();
				stmt.executeUpdate(url);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					db.con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}

	/*--------------------------------------�ֽ���--------------------------------------*/
	public void DeleteSortFromID(String id) {
		String url = "delete from sort where id = " + id;
		DBcon db = new DBcon();
		// System.out.println(url);
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(url);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	/*--------------------------------------�ֽ���--------------------------------------*/
	public void DeleteLinkFromID(String id){
		String url = "delete from links where id = " + id;
		DBcon db = new DBcon();
		// System.out.println(url);
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(url);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/*--------------------------------------�ֽ���--------------------------------------*/

	public void InsertSort(SortBean sort) {
		String url = "insert into sort values('" + sort.getName() + "',"
				+ sort.getBlogid() + ")";
		DBcon db = new DBcon();
		// System.out.println(url);
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(url);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/*--------------------------------------�ֽ���--------------------------------------*/
	public Vector SeachSortFromBlogId(String id) { // ͨ��blog��Ų�ѯ�������
		Vector v = new Vector();
		Vector temp = null;
		String url = "select name,id from sort where blogid = " + id;
		DBcon db = new DBcon();
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(url);
			while (rs.next()) {
				temp = new Vector();
				temp.add(rs.getString(1));
				temp.add(rs.getString(2));
				v.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return v;

	}

	/*--------------------------------------�ֽ���--------------------------------------*/
	public Vector SeachBlogFromID(String id) { // ͨ��id��ѯ
		Vector v = new Vector();
		Vector temp = null;
		String url = "select username,image from blog where id=" + id;
		// System.out.println(url);
		DBcon db = new DBcon();
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(url);
			while (rs.next()) {
				temp = new Vector();
				 temp.addElement(rs.getString(1));
				 temp.addElement(rs.getString(2));
				v.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return v;
	}

	/*--------------------------------------�ֽ���--------------------------------------*/
	public Vector SeachArticleFromSortID(String sortid) { // ͨ��Sortid��ѯ���±���
		Vector v = new Vector();
		Vector temp = null;
		String url = "select id,title,pubtime from article where sortid = " + sortid;
		DBcon db = new DBcon();
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(url);
			while (rs.next()) {
				temp = new Vector();
				temp.add(rs.getString(1));
				temp.add(rs.getString(2));
				temp.add(rs.getString(3));
				v.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return v;

	}
	/*--------------------------------------�ֽ���--------------------------------------*/
	public void UpdateBlogSelf(BlogSelf blog) { // ����blog���˻�����Ϣ
		String url = "update blog set username = '" + blog.getUsername()
				+ "',password = '" + blog.getPassword() + "',subject = '"
				+ blog.getSubject() + "',email = '" + blog.getEmail()
				+ "',uname = '" + blog.getUname() + "',age = '" + blog.getAge()
				+ "',works = '" + blog.getWorks() + "',six ='" + blog.getSix()
				+ "',likes = '" + blog.getLikes() + "' where id = "
				+ blog.getId();
		// System.out.println(url);
		DBcon db = new DBcon();
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(url);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					db.con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*--------------------------------------�ֽ���--------------------------------------*/
	public void UpdateBlogLogo(BlogSelf blog){  //���¸���logo
		String url = "update blog set image = '"+blog.getImage()+"' where id = "+blog.getId();
		DBcon db = new DBcon();
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(url);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					db.con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*--------------------------------------�ֽ���--------------------------------------*/
	
	
	/*--------------------------------------�ֽ���--------------------------------------*/
	public Vector SeachLinksFromBlogID(String id){  //ͨ��blogid��ѯ��������
		Vector v = new Vector();
		Vector temp = null;
		String url = "select id,name,url from links where blogid=" + id;
		// System.out.println(url);
		String s = "";
		DBcon db = new DBcon();
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(url);
			while (rs.next()) {
				temp = new Vector();
				temp.add(rs.getString(1));
				temp.add(rs.getString(2));
				temp.add(rs.getString(3));
				v.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return v;
	}
	
	/*--------------------------------------�ֽ���--------------------------------------*/
	
	public Vector SeachAContenFromID(String id){ //��ѯ��������
		Vector v = new Vector();
		Vector temp = new Vector();
		String url = "select content from article where id = " + id;
		DBcon db = new DBcon();
		try {
			Connection con = db.getCon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(url);
			if (rs.next()) {
				temp.add(id);
				temp.add(rs.getString(1));
				v.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				db.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return v;
	}
	/*--------------------------------------�ֽ���--------------------------------------*/

	public static void main(String[] args) {
		DAO d = new DAO();
		SortBean b = new SortBean();
		b.setBlogid("2");
		b.setName("���д");
		System.out.println(d.SeachLinksFromBlogID("3"));
	}

}
