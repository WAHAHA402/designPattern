package observer;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 17:49
 */
//使用 Subject 和实体观察者对象。
public class ObserverPatterDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
