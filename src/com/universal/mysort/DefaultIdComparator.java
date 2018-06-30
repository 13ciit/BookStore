/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.mysort;

import com.universal.model.Book;
import java.util.Comparator;


public class DefaultIdComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
             Book book1=(Book)o1;
        Book book2=(Book)o2;
       int b1=book1.getBookId();
        int b2=book2.getBookId();
        Integer iObject=b1;
        Integer jObject=b2;
        return iObject.compareTo(jObject);
        
    }
    
}
