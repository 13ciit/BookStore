package com.universal.model;


import com.universal.common.CommonToolClass;
import com.universal.model.Book;
import com.universal.myutil.MyCollections;
import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;


public class BookListModel implements ListModel<Book> {
ArrayList <Book> bkList=new ArrayList();
BookListModel()
{
  /* bookList.add(" c programming");
    bookList.add(" java programming");
    bookList.add("python programming");
    bookList.add(" ruby programming");
    bookList.add("android programming");*/
    
}

   public BookListModel(ArrayList<Book> bkList) {
      
    this.bkList= bkList;
    }
    @Override
    public int getSize() {
       return bkList.size();
    }

@Override
    public Book getElementAt(int index) {
     return bkList.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
}
