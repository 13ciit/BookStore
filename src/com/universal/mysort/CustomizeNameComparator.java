
package com.universal.mysort;

import com.universal.model.Book;
import java.util.Comparator;


public class CustomizeNameComparator implements Comparator{

       @Override
    public int compare(Object o1,Object o2) {
        Book book1=(Book)o1;
        Book book2=(Book)o2;
        String b1=book1.getBookName();
        String b2=book2.getBookName();
        if(b1.charAt(0)>b2.charAt(0))
        {
            return -1;
        }
        if(b1.charAt(0)<b2.charAt(0))
        {
            return 1;
        }
        else{
            return 0;
        }
    }
    
    
}
