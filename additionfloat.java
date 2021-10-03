class addfloat
{
  float m=40.f;
  float n=032.f;
}
public class additionfloat extends addfloat
{
    float sum=m+n;
    public static void main(String args[])
    {
        additionfloat obj= new additionfloat();
        System.out.print("addittion of float:"+obj.sum);
    }
    
}
