
package com.universal.myutil;

import com.universal.common.CommonToolClass;
import com.universal.mysort.CustomizeIdComparator;
import com.universal.mysort.CustomizeNameComparator;
import com.universal.mysort.CustomizePriceComparator;
import com.universal.mysort.DefaultIdComparator;
import com.universal.mysort.DefaultNameComparator;
import com.universal.mysort.DefaultPriceComparator;
import java.util.ArrayList;
import java.util.Collections;

public class MyCollections {
    public static ArrayList print(ArrayList originalBookList)
    {
        return originalBookList;
        //System.out.println(originalBookList);
    }
    public static ArrayList printById(ArrayList originalBookList)
    {
        
   //Collections.sort(originalBookList,new DefaultIdComparator());
                              //System.out.println(originalBookList);
   Collections.sort(originalBookList,new CustomizeIdComparator());
                           //System.out.println(originalBookList);
                           return originalBookList;
    }
    public static ArrayList printByName(ArrayList originalBookList)
    {
       Collections.sort(originalBookList,new DefaultNameComparator());
                                        /* System.out.println(originalBookList);

       Collections.sort(originalBookList,new CustomizeNameComparator());
                                  System.out.println(originalBookList);*/
        return originalBookList;

    }
    public static ArrayList printByPrice(ArrayList originalBookList)
    {
     Collections.sort(originalBookList,new DefaultPriceComparator());
     //                                  System.out.println(originalBookList);

     //Collections.sort(originalBookList,new CustomizePriceComparator());
                                 //System.out.println(originalBookList);*/
        return originalBookList;
    }
}
