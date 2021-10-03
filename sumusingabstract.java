abstract class one{
   abstract void add();
}
public class sumusingabstact extends one{
    public void add(){
        float a=10.0f;
        float b=02.0022332f;
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        sumusingabstact o=new sumusingabstact();
        o.add();
    }
}
