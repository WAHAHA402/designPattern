package builder;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 16:33
 */
//抽象生产者
public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();

    Product getProduct();
}
