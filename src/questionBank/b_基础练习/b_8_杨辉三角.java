package questionBank.b_基础练习;

import java.util.Scanner;

public class b_8_杨辉三角 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 上一行
        int[] a = new int[n];
        a[0] = 1;
        // 下一行
        int[] b = new int[n];
        // 中间变量
        int[] c = new int[n];

        System.out.println(1);
        if (n>1) {
            int hangshu=1;
            // 输出每一行
            for (int i = 0; i < c.length-1; i++) {
                System.out.print(1+" ");
                // 1 之后，所有的值
                for (int j = 1; j < hangshu; j++) {
                    b[j]=a[j-1]+a[j];
                    System.out.print(b[j]+" ");
                }
                System.out.println(1);
                b[0]=1;
                b[hangshu]=1;
                c=b;
                b=a;
                a=c;
                hangshu++;
            }
        }
    }
}
/*
问题描述
杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。

它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
下面给出了杨辉三角形的前4行：
　　
   1
  1 1
 1 2 1
1 3 3 1

给出n，输出它的前n行。

输入格式

输入包含一个数n。

输出格式
输出杨辉三角形的前n行。每一行从这一行的第一个数开始依次输出，中间使用一个空格分隔。请不要在前面输出多余的空格。
样例输入
4
样例输出
1
1 1
1 2 1
1 3 3 1
数据规模与约定
1 <= n <= 34。
 */