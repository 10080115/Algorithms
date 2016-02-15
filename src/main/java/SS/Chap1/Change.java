package SS.Chap1;

/**
 * Created by bjlishiwei on 2016/2/15.
 */
public class Change {

    public static void main(String[] args) {
        int a1 = 3,b1=4;
        int a2 = 3,b2=4;
        int a3 = 3,b3=4;
        int c1 = 5;
        System.out.println(c1^c1^a1);
        //1
        int c = a1;
        a1=b1;
        b1=c;
        System.out.println(a1+" "+b1);

        //2
        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;
        System.out.println(a2+" "+b2);

        //3 自身的^就是0
        a3 = a3 ^ b3;
        b3 = a3 ^ b3;
        a3 = a3 ^ b3;
        System.out.println(a3+" "+b3);

    }
}
