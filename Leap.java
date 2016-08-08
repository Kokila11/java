import java.util.Scanner;
class Leap
{
public static void main(String[],arg)
{
char i;
Scanner in=new Scanner(System.in);
i=in.nextInt;
if(i%4==0)

System.out.println(i+"is leap year");
else if(i%400==0)
System.out.println(i+"is leap year");
else
System.out.println(i+"is not leap year");

}
}