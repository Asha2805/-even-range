import java.util.*;
public class even
{
public static void main(String[] args)
{
int a,b;
Scanner w=new Scanner(System.in);
a=w.nextInt();
b=w.nextInt();
for(int i=a;i<b;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
