package observer;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 17:37
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Octal String: " +
         Integer.toOctalString(subject.getState()));
    }
}
