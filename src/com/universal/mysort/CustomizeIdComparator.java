
package com.universal.mysort;

import com.universal.model.Book;
import java.util.Comparator;


public class CustomizeIdComparator implements Comparator{

    @Override
    public int compare(Object o1,Object o2) {
        Book book1=(Book)o1;
        Book book2=(Book)o2;
        int b1=book1.getBookId();
        int b2=book2.getBookId();
        if(b1>b2)
        {
            return 1;
        }
        if(b1<b2)
        {
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
