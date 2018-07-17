package factoryMethod;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/16 10:29
 */
public class Main {
    public static void main(String[] args) {
        CarFactory pf = new PorscheFactory();
        pf.productCar();
        CarFactory tf = new TractorFactory();
        tf.productCar();
        CarFactory bf = new BMWFactory();
        bf.productCar();
    }

}

