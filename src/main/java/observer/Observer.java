package observer;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 17:30
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
