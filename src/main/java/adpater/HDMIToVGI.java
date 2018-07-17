package adpater;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 10:40
 */
//将HDMI接口转换为VGI，这就是适配器
public class HDMIToVGI implements VGIPort {
    HMDIPort hmdiPort;

    public HDMIToVGI(HMDIPort hmdiPort){
        this.hmdiPort = hmdiPort;
    }

    //将HDMI接口转换为VGI接口
    @Override
    public void workByVGI(){
        hmdiPort.workByHDMI();
    }
}
