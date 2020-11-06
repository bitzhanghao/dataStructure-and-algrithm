package cn.edu.bit.gener;

public class GenericMethod01
{
    /*
    泛型方法介绍：
    最重要的就是泛型静态方法
    1、首先对java程序的加载与执行进行分析
        java程序主要分为两个部分：编译与运行
        编译阶段：编写程序->javac编译器进行编译生成class字节码文件
        运行阶段：类加载器进行加载->jvm虚拟机上->操作系统os->硬件平台
    2、定义，什么是泛型方法
        这里需要注意的是泛型方法不是泛型类中的方法，而是加上泛型的方法
        例如格式： public <T,K> T fanXingMethod(K k){}
    3、因为静态方法的加载是优先于类的实例化的，就泛型而言，泛型就相当于一个占位符，需要在类实例化之后传入一个参数

     */
}
