package builder;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 16:35
 */
//具体生产者
public class ConcreteBuilder implements Builder {
    Product product;

    @Override
    public void buildPartA(){
        //具体实现
    }

    @Override
    public void buildPartB(){
        //具体实现
    }

    @Override
    public void buildPartC(){
        //具体实现
    }

    @Override
    public Product getProduct(){
        return product;
    }
}
