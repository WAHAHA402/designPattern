package factoryMethod;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 10:29
 */ //宝马工厂
class BMWFactory implements CarFactory {
    @Override
    public void productCar(){
        System.out.println("生产宝马");
    }
}
