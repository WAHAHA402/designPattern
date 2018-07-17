package abstractFactory;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 14:13
 */
//生产InterCPU工厂的工厂
public class InterCPUFactory implements Provider {
    @Override
    public CPUFactory createCPUFactory(){
        return new IntelCPU();
    }
}
