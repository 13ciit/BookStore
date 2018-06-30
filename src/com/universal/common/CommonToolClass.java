/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.common;

import com.universal.model.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CommonToolClass {

   /* public static ArrayList getOriginalBookList()
    {
        
     ArrayList bookList=new ArrayList();
       Book book1=new Book(121,"Java complete reffrence",485.95);
        Book book2=new Book(123,"THE ART OF INVISIBILITY",787.65);
        Book book3=new Book(125,"Let us C",635.65);
        Book book4=new Book(122,"Eloquent Java Script",546.87);
        Book book5=new Book(124,"Programming phoenix",325.95);
        Book book6=new Book(126,"Beginner's Guide To Python",965.95);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);  
        return bookList;
}*/
        public static ArrayList getOriginalBookList() throws SQLException
    {
       
      ArrayList bookList=new ArrayList();
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/BookStore","root","");
         String sql="select * from bookList";
          java.sql.Statement st=conn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          while(rs.next())
          {
              
          
          int bookId=rs.getInt(1);
          String bookName=rs.getString(2);
          double bookPrice=rs.getDouble("bookPrice");
       Book book=new Book(bookId,bookName,bookPrice);
        bookList.add(book);
          }

        return bookList;
}
}