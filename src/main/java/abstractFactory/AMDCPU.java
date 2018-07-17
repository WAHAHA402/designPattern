package abstractFactory;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 14:09
 */
//AMDCPU工厂
public class AMDCPU implements CPUFactory {
    @Override
    public void createCPU(){
        System.out.println("AMD CPU");
    }
}
