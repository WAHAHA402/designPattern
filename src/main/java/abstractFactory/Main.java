package abstractFactory; /**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 11:12
 */

/**
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 抽象工厂是工厂模式的升级版，他用来创建一组相关或者相互依赖的对象。
 */
/**
 * 上节学习了工厂模式，类的创建依赖工厂类，程序需要扩展时，我们必须创建新的工厂类。工厂类是用来生产产品的，
 * 那我们也可以把“工厂类当成我们要生产的产品”，所以抽象工厂就是“工厂的工厂”，即生产工厂的工厂。
 * 下面通过一个例子来深入理解。
 */

public class Main {

    public static void main(String[] args) {
        //创建两个生产CPU工厂的工厂
        Provider interCPUFactory =  new InterCPUFactory();
        Provider amdCPUFactory = new AMDCPUFactory();

        //分别通过CPU工厂的工厂各创建一个工厂
        CPUFactory interCPU = interCPUFactory.createCPUFactory();
        CPUFactory amdCPU = amdCPUFactory.createCPUFactory();

        //两个工厂分别生产CPU
        interCPU.createCPU();
        amdCPU.createCPU();
    }



}
