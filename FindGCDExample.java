public class FindGCDExample1   
{  
public static void main(String[] args)   
{  
//x and y are the numbers to find the GCF  
int a = 12, b = 8, gcd = 1;  
//running loop form 1 to the smallest of both numbers  
for(int i = 1; i <= a && i <= b; i++)  
{  
//returns true if both conditions are satisfied   
if(a%i==0 && b%i==0)  
//storing the variable i in the variable gcd  
gcd = i;  
}  
//prints the gcd  
System.out.printf("GCD of %d and %d is: %d", a, b, gcd);  
}  
}  
