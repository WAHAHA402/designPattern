package singleton; /**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 10:25
 */

/**
 *  单例模式--单线程
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点，避免一个全局使用的类频繁的创建和销毁，
 * 节省系统资源，提高程序效率。怎么创建唯一的实例？Java是这么创建实例的 Person p = new Person();
 * 但是这么创建会创建多个实例，所以我们必须把构造器设为私有，这样其他类就不能使用new来实例化一个类。
 */

/**
 * 这种实现方式并不是线程安全的，当有多个线程同时调用Singleton.getInstance()方法时会产生多个实例。
 * 下节我们来学习多线下如何实现单例模式。
 */
public class Singleton {

    //定义一个属性,用来保存Singleton类对象的实例
    private static Singleton instance;

    //私有构造器,该类不能被外部类使用new方式实例化
    private Singleton(){

    }

    //外部通过该方法获取Singleton类的唯一实例
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        //判断两个实例s1 s2是否为同一个实例
        System.out.println(s1 == s2);
    }
}
