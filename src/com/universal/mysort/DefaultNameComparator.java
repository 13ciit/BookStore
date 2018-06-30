/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.mysort;

import com.universal.model.Book;
import java.util.Comparator;

/**
 *
 * @author Lenovo
 */
public class DefaultNameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
             Book book1=(Book)o1;
        Book book2=(Book)o2;
        String b1=book1.getBookName();
        String b2=book2.getBookName();
        return b1.compareTo(b2);
    }
    
}
