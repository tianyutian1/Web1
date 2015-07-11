package com.NewNews;


import java.util.Vector;

class Test {

	public static void main(String[] args) {
		int k=0;
		int j=0;
		DAO db = new DAO();
		Vector v = new Vector();
		v = db.SeachSortFromBlogId("3");
				for (int i = 0; i < v.size(); i++) {
					if((k+3)%3==0){
						
						System.out.println("<tr>");	
						
					}
						Vector temp = (Vector) v.get(i);
						System.out.println("<td>");
						System.out.println("<a href='showArticle.jsp?sortid='"+temp.get(1)+
							" class='Sortname' target='showA'>");
						System.out.println(temp.get(0));
						System.out.println("</td>");
						//System.out.println(k);
						if((k+1)%3==0){
							System.out.println("</tr>");
						}
						k++;
					}
					
				}
			}

