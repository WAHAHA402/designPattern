package abstractFactory;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 14:04
 */
//IntelCPU工厂
public class IntelCPU implements CPUFactory {
    @Override
    public void createCPU(){
        System.out.println("Intel CPU");
    }

}
