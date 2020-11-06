package cn.edu.bit.gener;

public class GenericInterfaceImpl01<T> implements GenericInterface01<T>
{
    @Override
    public void printMF(T t)
    {
        System.out.println(t);
    }
}
