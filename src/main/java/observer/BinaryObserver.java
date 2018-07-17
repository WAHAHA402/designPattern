package observer;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 17:34
 */
//创建实体观察者类。
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Binary String: "
        + Integer.toBinaryString(subject.getState()));
    }
}
