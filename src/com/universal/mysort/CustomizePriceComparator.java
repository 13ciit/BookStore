
package com.universal.mysort;

import com.universal.model.Book;
import java.util.Comparator;


public class CustomizePriceComparator implements Comparator{
    @Override
    public int compare(Object o1,Object o2) {
        Book book1=(Book)o1;
        Book book2=(Book)o2;
        double b1=book1.getBookPrice();
        double b2=book2.getBookPrice();
        if(b1>b2)
        {
            return -1;
        }
        if(b1<b2)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}
