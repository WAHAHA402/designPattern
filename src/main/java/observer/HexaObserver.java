package observer;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 17:41
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Hex String: "
        + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
