/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.model;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Lenovo
 */
public class BookTableModel implements TableModel{
    ArrayList <Book> bkList=new ArrayList();
String[] columnName={"ID","NAME","PRICE"};
Class []columnInfo={Integer.class,String.class,Double.class};

    public BookTableModel(ArrayList<Book> bkList) {
        this.bkList=bkList;
    }
    

    @Override
    public int getRowCount() {

return bkList.size();
        }

    @Override
    public int getColumnCount() {
        
return columnName.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        
        return columnName[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnInfo[columnIndex];
        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
Book b=bkList.get(rowIndex);
switch(columnIndex)
{
    case 0:return b.bookId;
    case 1:return b.bookName;
    case 2:return b.bookPrice;
    
}
        return null;

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
