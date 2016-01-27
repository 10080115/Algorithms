package Thread.Chap1;

/**
 * Created by bjlishiwei on 2016/1/26.
 */
public class SharedPro {
    public static void main(String[] args) {
//这个记录的是数据不进行共享的
//        ThreadShare1 a = new ThreadShare1("a");
//        ThreadShare1 b = new ThreadShare1("b");
//        ThreadShare1 c = new ThreadShare1("c");
//        a.start();
//        b.start();
//        c.start();
        ThreadShare1 threadShare1 =new ThreadShare1();
        Thread a = new Thread(threadShare1,"A");
        Thread b = new Thread(threadShare1,"B");
        Thread c = new Thread(threadShare1,"C");
        Thread d = new Thread(threadShare1,"D");
        a.start();
        b.start();
        c.start();
        d.start();
    }
}

class ThreadShare1 extends Thread{
    private int count = 5;


//    public ThreadShare1(String s){
//        super();
//        this.setName(s);
//    }

    @Override
    public void run(){
        super.run();
        while ( count>0 )
            System.out.println((count--)+Thread.currentThread().getName());
    }
}
