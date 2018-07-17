package strategy;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/17 9:10
 */

/**
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。
 1.Strategy：策略接口，用来约束一系列具体的策略算法。Context使用这个接口来调用具体的策略，实现定义的策略。

 2.ConcreteStrategy：具体的策略实现，也就是具体的算法实现。

 3.Context：上下午，负责与具体的策略交互，通常上下文会持有一个真正的策略实现。

    策略模式是把一个类中经常改变或者将来可能改变的部分提取出来作为一个接口，然后在类中包含这个对象的实例，
    这样类的实例在运行时就可以随意调用实现了这个接口的类的行为。
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new OperationSubstract());
        System.out.println("3 - 2 = " + context.calculate(3, 2));

        context = new Context(new OperationDivide());
        System.out.println("100 / 10 = " + context.calculate(100, 10));
    }
}
