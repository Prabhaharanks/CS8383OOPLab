interface addtion
{
    public void add();
}
public class additioninterface implements addtion
{
    public void add()
    {
        float a=20.0f;
        float b=100;
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        additioninterface obj= new additioninterface();
       obj.add();
    }
    
}
