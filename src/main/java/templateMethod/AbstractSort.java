package templateMethod;

/**
 * 模板方法模式是编程中经常用到的模式，其非常简单，AbstractClass叫抽象模板，其方法分为3类：

 1.抽象方法：父类中只声明但不加以实现，而是定义好规范，然后由它的子类去实现。

 2.模版方法：由抽象类声明并加以实现。一般来说，模版方法调用抽象方法来完成主要的逻辑功能，并且，模版方法大多
 会定义为final类型，指明主要的逻辑功能在子类中不能被重写。

 3.钩子方法：由抽象类声明并加以实现。但是子类可以去扩展，子类可以通过扩展钩子方法来影响模版方法的逻辑。

 实现类用来实现细节。抽象类中的模版方法正是通过实现类扩展的方法来完成业务逻辑。
 */
//抽象模板类
abstract class AbstractSort{
    public abstract void sort(int[] array);
    //防止子类覆盖使用final修饰符
    public final void printArray(int[] array){
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
