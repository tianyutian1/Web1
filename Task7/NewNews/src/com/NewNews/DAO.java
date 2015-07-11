package com.NewNews;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.Vector;

public class DAO {

	public void InsertUser() { // 插入用户

	}

	/*--------------------------------------分界线--------------------------------------*/
	public void InsertFeedback() { // 插入留言

	}

	/*--------------------------------------分界线--------------------------------------*/
	public void InsertArticle() { // 插入文章

	}
	
	/*--------------------------------------分界线--------------------------------------*/
	public void InsertLinksForBlogId(LinksBean lb){  //根据blogid查询友情链接
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

	/*--------------------------------------分界线--------------------------------------*/
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
	
	/*--------------------------------------分界线--------------------------------------*/
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

	/*--------------------------------------分界线--------------------------------------*/

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

	/*--------------------------------------分界线--------------------------------------*/
	public Vector SeachSortFromBlogId(String id) { // 通过blog编号查询文章类别
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

	/*--------------------------------------分界线--------------------------------------*/
	public Vector SeachBlogFromID(String id) { // 通过id查询
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

	/*--------------------------------------分界线--------------------------------------*/
	public Vector SeachArticleFromSortID(String sortid) { // 通过Sortid查询文章标题
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
	/*--------------------------------------分界线--------------------------------------*/
	public void UpdateBlogSelf(BlogSelf blog) { // 更新blog个人基本信息
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
	
	/*--------------------------------------分界线--------------------------------------*/
	public void UpdateBlogLogo(BlogSelf blog){  //更新个人logo
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

	/*--------------------------------------分界线--------------------------------------*/
	
	
	/*--------------------------------------分界线--------------------------------------*/
	public Vector SeachLinksFromBlogID(String id){  //通过blogid查询友情连接
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
	
	/*--------------------------------------分界线--------------------------------------*/
	
	public Vector SeachAContenFromID(String id){ //查询文章内容
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
	/*--------------------------------------分界线--------------------------------------*/

	public static void main(String[] args) {
		DAO d = new DAO();
		SortBean b = new SortBean();
		b.setBlogid("2");
		b.setName("随便写");
		System.out.println(d.SeachLinksFromBlogID("3"));
	}

}
