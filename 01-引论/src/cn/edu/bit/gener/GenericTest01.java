package cn.edu.bit.gener;

/**
 * generic 泛型的讲解
 * 1、泛型类
 * 2、泛型接口
 * 3、泛型方法
 *
 * 4、泛型通配符
 *      泛型通配符的讲解：其实就是一个占位，例如形参为一个泛型类，Generic<T> 传参的时候是要限定值的，Generic<?> 相当于父类为Object，其他类Generic类
 *      都将可以作为参数使用
 * 5、泛型边界
 */

public class GenericTest01
{
    public static void main(String[] args)
    {
        /*GenericClass01<String> gc = new GenericClass01<>(); // 菱形表达式
        gc.printMsg("泛型类的方法加载！");*/
        GenericInterface01<String> gi = new GenericInterfaceImpl01<>();
        gi.printMF("接口泛型的调用！");


    }
}
