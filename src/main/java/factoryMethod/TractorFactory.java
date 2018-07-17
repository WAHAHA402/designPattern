/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 10:58
 */
package factoryMethod;
import factoryMethod.BMWFactory;
import factoryMethod.CarFactory;

//拖拉机工厂
class TractorFactory implements CarFactory{
    @Override
    public void productCar(){
        System.out.println("生产拖拉机");
    }
}


