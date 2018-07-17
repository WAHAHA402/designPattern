package decorator;

/**
 * 作者:      zhangrw
 * 功能描述：    装饰器模式
 * 创建时间：  2018/7/16 11:50
 */

/**
 * 对客户透明的方式动态地给一个对象附加上更多的责任，同时又不改变其结构。
 * 装饰模式可以在不使用创造更多子类的情况下，将对象的功能加以扩展。
 *
 1.抽象构件(Component)角色：给出一个抽象接口，以规范准备接收附加责任的对象。

 2.具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类。

 3.装饰(Decorator)角色：持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口。

 4.具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。

 我们将创建一个Shape接口和实现了 Shape 接口的实体类。然后我们创建一个实现了 Shape 接口的抽象装饰类ShapeDecorator，
 并把 Shape 对象作为它的实例变量。

 RedShapeDecorator 是实现了 ShapeDecorator 的实体类。

 DecoratorPatternDemo，我们的演示类使用 RedShapeDecorator 来装饰 Shape 对象。
 */
//使用RedShapeDecorator来装饰Shape对象
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Cirle with red border");
        redCircle.draw();

        System.out.println("Rectangle with red border");
        redRectangle.draw();
    }
}
