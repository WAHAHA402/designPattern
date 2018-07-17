package strategy;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/17 9:21
 */
//上下文
public class Context {

    //持有一个具体策略对象
    private Strategy strategy;

    //传入一个具体策略对象
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int calculate(int num1, int num2){
        //调用具体策略对象进行算法运算
        return strategy.calculate(num1, num2);
    }
}
