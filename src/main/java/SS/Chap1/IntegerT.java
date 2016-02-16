package SS.Chap1;

/**
 * Created by bjlishiwei on 2016/2/16.
 */
public class IntegerT {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a==b);
        System.out.println(c==d);


        /**
         *   [-127,high]?cache:new Integer(i);
         *   public static Integer valueOf(int i) {
             assert IntegerCache.high >= 127;
             if (i >= IntegerCache.low && i <= IntegerCache.high)
                return IntegerCache.cache[i + (-IntegerCache.low)];
             return new Integer(i);
         }
         */

        //将Integer拆箱 基本数据类型=就可以
        Integer m = 128;
        int m1 =128;
        if(m==m1)
            System.out.println("=");
    }
}
