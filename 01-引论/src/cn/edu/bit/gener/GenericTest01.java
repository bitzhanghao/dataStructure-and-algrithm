package cn.edu.bit.gener;

/**
 * generic 泛型的讲解
 * 1、泛型类
 * 2、泛型接口
 * 3、泛型方法
 * 4、泛型通配符
 * 5、泛型边界
 */

public class GenericTest01
{
    public static void main(String[] args)
    {
        GenericClass01<String> gc = new GenericClass01<>(); // 菱形表达式
        gc.printMsg("泛型类的方法加载！");

    }
}
