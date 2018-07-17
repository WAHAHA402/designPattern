package abstractFactory;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 14:19
 */
//生产AMDCPU工厂的工厂
public class AMDCPUFactory implements Provider {
    @Override
    public CPUFactory createCPUFactory(){
        return new AMDCPU();
    }
}
