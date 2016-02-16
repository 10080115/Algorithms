package SS.Chap1;

import java.text.Collator;
import java.util.*;

/**
 * Created by bjlishiwei on 2016/2/16.
 */
public class ArrayL {
    @SuppressWarnings("rawtypes")
    private final static Comparator CHINA_COMPARE = Collator.getInstance(Locale.CHINA);

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("a","b","c");
//        System.out.println(list);
//
//        List<String> list2 = new ArrayList<String>();
//        list2.add("a");
//        list2.add("b");
//        list2.add("c");
//        System.out.println(list2);
        sortArray();
        sortList();
    }
    //false
    private static void sortList(){
        List<String> list = Arrays.asList("张三","李四","王五");
        Collections.sort(list,CHINA_COMPARE);
        for (String str : list)
            System.out.println(str);
    }

    //ok
    private static void sortArray(){
       String arr[] = {"张三","李四","王五"};
        Arrays.sort(arr, CHINA_COMPARE);
        for (String str : arr)
            System.out.println(str);
    }
}
