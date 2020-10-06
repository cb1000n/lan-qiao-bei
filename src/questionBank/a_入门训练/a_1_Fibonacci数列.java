package questionBank.a_入门训练;

import java.util.Scanner;

public class a_1_Fibonacci数列 {
    // 我的
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (1<=a & a<=1000000) {
            Integer[] f = new Integer[a];
            f[0] = 1;
            f[1] = 1;
            for (int i = 2; i < f.length; i++) {
                f[i] = (f[i-1]+f[i-2])%10007;
                System.out.println(f[i]);
            }
            System.out.println(f[a-1]);
        }
    }
    // 正解
//	public static void main(String[] args) {
//		int n;
//		Scanner reader=new Scanner(System.in);
//		n=reader.nextInt();
//		int f1=1,f2=1,f3 = 1;
//		for(int i=3;i<=n;i++){
//			//
//			f3=(f1%10007+f2%10007)%10007;
//			f1=f2;
//			f2=f3;
//		}
//		System.out.println(f3);
//	}
	/*
	 *总结：
	 *	我的：计算出来每一个元素对10007取余的结果，最后，直接取出来最后一个
	 *	正解：不用数组存，每次舍弃上次计算的结果，
	 */
}
/**
 * 	Fibonacci数列:http://lx.lanqiao.cn/problem.page?gpid=T4
 * 问题描述
 Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 输入格式
 输入包含一个整数n。
 输出格式
 输出一行，包含一个整数，表示Fn除以10007的余数。
 说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，
 直接计算余数往往比先算出原数再取余简单。
 样例输入
 10
 样例输出
 55
 样例输入
 22
 样例输出
 7704
 数据规模与约定
 1 <= n <= 1,000,000。
 */