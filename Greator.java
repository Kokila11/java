import java.util.Scanner;
class Greator
{
public static void main(String[],arg)
{
int a,b,c;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b&&a>c)

System.out.println(a+"is greator");
else
{
 if(b>c)
System.out.println(b+"is greator");
else
System.out.println(c+"is greator");
}
}
}