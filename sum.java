abstract class one{
   abstract void add();
}
public class sum extends one{
    public void add(){
        float a=10.0f;
        float b=02.0022332f;
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        sum o=new sum();
        o.add();
    }
}
