package questionBank.b_基础练习;

public class b_7_特殊的数 {
    public static void main(String[] args) {
        int a =0 ;
        int b=0;
        int c=0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    a=i*i*i+j*j*j+k*k*k;
                    if (a>99 && a<1000) {
                        b=a/100;
                        c=(a%100)/10;
                        if (i==b&&j==c&&k==a%10) {
                            System.out.println(""+i+j+k);
                        }
                    }
                }
            }
        }
    }
}
/*
问题描述
　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 */