package strategy;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/17 9:18
 */
//具体算法，除法
public class OperationDivide implements Strategy {
    @Override
    public int calculate(int num1, int num2){
        int res = 0;
        try{
            res = num1 / num2;
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
}
