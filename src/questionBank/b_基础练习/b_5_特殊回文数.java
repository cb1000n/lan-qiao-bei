package questionBank.b_基础练习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b_5_特殊回文数 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        // 自己写的方法
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i + i + j + j + k == n) {
                        arr.add(Integer.valueOf(new StringBuilder().append(i).append(j).append(k).append(j).append(i).toString()));
                    }
                    if (i + i + j + j + k + k == n) {
                        arr.add(Integer.valueOf(new StringBuilder().append(i).append(j).append(k).append(k).append(j).append(i).toString()));
                    }
                }
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        Arrays.sort(res);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        // 百度的方法
//        for (long i = 10000; i < 100000; i++) {
//            long a = i / 10000;                //第一个
//            long b = (i - a * 10000) / 1000;            //第二个
//            long c = (i - a * 10000 - b * 1000) / 100;        //第三个
//            long d = (i - a * 10000 - b * 1000 - c * 100) / 10;    //第四个
//            long e = (i - a * 10000 - b * 1000 - c * 100) % 10;    //第五个
//            if (a == e && b == d)    //是否为回文数
//            {
//                if (a + b + c + d + e == n)    //是否为五位特殊回文数
//                {
//                    System.out.println("" + a + b + c + d + e);
//                }
//            }
//        }
//        for (long i = 100000; i < 1000000; i++) {
//            long a = i / 100000;                    //第一个
//            long b = (i - a * 100000) / 10000;                //第二个
//            long c = (i - a * 100000 - b * 10000) / 1000;            //第三个
//            long d = (i - a * 100000 - b * 10000 - c * 1000) / 100;        //第四个
//            long e = (i - a * 100000 - b * 10000 - c * 1000 - d * 100) / 10;    //第五个
//            long f = (i - a * 100000 - b * 10000 - c * 1000 - d * 100) % 10;    //第六个
//            if (a == f && b == e && c == d)    //是否为回文数
//            {
//                if ((a + b + c + d + e + f) == n)        //是否为六位特殊回文数
//                {
//                    System.out.println("" + a + b + c + d + e + f);
//                }
//            }
//        }
    }
}
/**
 * 特殊回文数:http://lx.lanqiao.cn/problem.page?gpid=T48
 * 问题描述
 * 　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
 * 　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 * 输入格式
 * 　　输入一行，包含一个正整数n。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
 * 样例输入
 * 52
 * 样例输出
 * 899998
 * 989989
 * 998899
 * 数据规模和约定
 * 　　1<=n<=54。
 */