package questionBank.b_基础练习;

import java.util.Scanner;

public class b_4_十进制转十六进制 {

    // 百度的，网友自己实现
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n == 0) {
            System.out.println(n);
            return;
        }
        StringBuffer stb = new StringBuffer(8);
        char toHex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n != 0) {
            int i = n%16;//16进制，除以16取余
            stb = stb.append(toHex[i]);
            n /= 16;
        }
        //逆序输出
        System.out.println(stb.reverse().toString());
    }
    // 百度的，JDK自带方法
//    public static void main(String args[]){
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        input.close();
//        String a = Integer.toHexString(n);//十进制转十六进制
//        // toUpperCase 小写转换大写
//        System.out.printf(a.toUpperCase());
//    }




// 自己写的
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int scInt = sc.nextInt();
//        int a = scInt;
//        int b = 0;
//        StringBuilder res = new StringBuilder();
//        for (; a > 15;) {
//            b = a%16;
//            a = a/16;
//            if (b < 10) {
//                res.insert(0, b+"");
//                continue;
//            }
//            switch (b){
//                case 10:
//                    res.insert(0, "A");
//                    break;
//                case 11:
//                    res.insert(0, "B");
//                    break;
//                case 12:
//                    res.insert(0, "C");
//                    break;
//                case 13:
//                    res.insert(0, "D");
//                    break;
//                case 14:
//                    res.insert(0, "E");
//                    break;
//                case 15:
//                    res.insert(0, "F");
//                    break;
//            }
//        }
//        if (a < 10) {
//            res.insert(0, a + "");
//        } else {
//            switch (a){
//                case 10:
//                    res.insert(0, "A");
//                    break;
//                case 11:
//                    res.insert(0, "B");
//                    break;
//                case 12:
//                    res.insert(0, "C");
//                    break;
//                case 13:
//                    res.insert(0, "D");
//                    break;
//                case 14:
//                    res.insert(0, "E");
//                    break;
//                case 15:
//                    res.insert(0, "F");
//                    break;
//            }
//        }
//        System.out.println(res);
//    }
}
/*
问题描述
　　十六进制数是在程序设计时经常要使用到的一种整数的表示方式。它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，以此类推，十进制的30在十六进制中是1E。
　　给出一个非负整数，将它表示成十六进制的形式。
输入格式
　　输入包含一个非负整数a，表示要转换的数。0<=a<=2147483647
输出格式
　　输出这个整数的16进制表示
样例输入
30
样例输出
1E
 */