package singleton; /**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 10:36
 */

/**
 * Java多线程程序，线程执行顺序是不确定的，所以在同时多个线程调用Singleton.getInstance()方法时，
 * 存在创建多个实例的可能，
 * 会引起程序执行错误。那我们该如何实现多线程下安全的创建一个唯一的实例呢？锁，加锁。在线程调用
 * singleton.Singleton.getInstance()方法时,判断instance == null ? 是，加锁，
 * 其他线程这时只能等待这个线程释放锁，才能进入临界区。那如何加锁，可以使用synchronized。
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        //synchronized加锁同步会降低效率，这里先判断是否为空
        //不为空则不需要加锁，提高程序效率
        if (instance == null){
            synchronized(Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1 == s2);
    }
}
