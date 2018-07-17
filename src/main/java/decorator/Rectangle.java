package decorator;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 15:56
 */
//创建实现接口的实体类。
public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Shape: Rectangle");
    }
}
