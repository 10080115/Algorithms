package Thread.Chap1;

/**
 * Created by bjlishiwei on 2016/1/26.
 */

/**
 * start方法只能被调用一次 threadState 从 0 进行了改变
 *
 */
class MyThread extends Thread{
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running");
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Runnable runnable = new MyThread2();
    }
}
