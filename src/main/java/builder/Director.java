package builder;

/**
 * 作者:      zhangrw
 * 功能描述：
 * 创建时间：  2018/7/13 16:41
 */

/**
 * 指导者，产品生产流程规范
 */
public class Director {

    Builder builder;

    //由具体的生产者来生产产品
    public Director(Builder builder){
        this.builder = builder;
    }

    //生产流程
    public void buildProduct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

}
