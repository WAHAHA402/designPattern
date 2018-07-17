package strategy;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/17 9:16
 */
//具体算法，减法
public class OperationSubstract implements Strategy{
    @Override
    public int calculate(int num1, int num2){
        return num1 - num2;
    }

}
