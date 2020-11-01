package cn.edu.bit.gener;

public class GenericClass01 <T>
{
    // 泛型类
    /*
    泛型类：
     */
    private T id;
    public void printMsg(T msg)
    {
        System.out.println(msg);
    }
}
