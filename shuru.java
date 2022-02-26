//输出结果：x的a次方（jieguo）
import java.util.Scanner;
public class shuru
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符x" );
        int x= sc.nextInt();
        System.out.println("请输入字符a" );
        int a= sc.nextInt();
        int jieguo =1;
        for(int i=0;i<a;i++)
        {
            jieguo*=x;
        }
        System.out.println(jieguo);
    }
}