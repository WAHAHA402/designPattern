package factoryMethod;

/**
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类。
 */
//汽车工厂
interface CarFactory{
    void productCar();
}
