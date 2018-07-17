package decorator;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 15:59
 */
//创建实现了 Shape 接口的抽象装饰类。
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
