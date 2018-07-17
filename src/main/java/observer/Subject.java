package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 17:23
 */
public class Subject {
    private List<Observer> observers
            = new ArrayList<Observer>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }
    //添加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //删除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //do something
    public void dosometing(){
        //do something here
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
