package questionBank.b_基础练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b_2_十六进制转八进制 {

    //	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a =sc.nextInt();
//		String b = null;
//		char[] c = new char[a];
//		String[] g = new String[a];
//		StringBuffer d = new StringBuffer();
//		for (int i = 0; i < a; i++) {
//			b=sc.next();
//			c=b.toCharArray();
//			for (int j = 0; j < c.length; j++) {
//				switch (c[j]) {
//				case '0':
//					d.append("0000");
//					break;
//				case '1':
//					d.append("0001");
//					break;
//				case '2':
//					d.append("0010");
//					break;
//				case '3':
//					d.append("0011");
//					break;
//				case '4':
//					d.append("0100");
//					break;
//				case '5':
//					d.append("0101");
//					break;
//				case '6':
//					d.append("0110");
//					break;
//				case '7':
//					d.append("0111");
//					break;
//				case '8':
//					d.append("1000");
//					break;
//				case '9':
//					d.append("1001");
//					break;
//				case 'A':
//					d.append("1010");
//					break;
//				case 'B':
//					d.append("1011");
//					break;
//				case 'C':
//					d.append("1100");
//					break;
//				case 'D':
//					d.append("1101");
//					break;
//				case 'E':
//					d.append("1110");
//					break;
//				case 'F':
//					d.append("1111");
//					break;
//				}
//			}
//			int e=0;
//			if (d.length()%3==1) {
//				d.insert(0, "00");
//			} else if(d.length()%3==2){
//				d.insert(0, "0");
//			}
//			if (d.substring(0, 3).equals("000")) {
//				e=1;
//			}
//			String ba="";
//			for (int j = 0; j+e < d.length()/3; j++) {
//				switch (d.substring((j+e)*3, (j+e+1)*3)) {
//				case "000":
//					ba+="0";
//					break;
//				case "001":
//					ba+="1";
//					break;
//				case "010":
//					ba+="2";
//					break;
//				case "011":
//					ba+="3";
//					break;
//				case "100":
//					ba+="4";
//					break;
//				case "101":
//					ba+="5";
//					break;
//				case "110":
//					ba+="6";
//					break;
//				case "111":
//					ba+="7";
//					break;
//				default:
//					break;
//				}
//				g[i]=ba;
//			}
//			d.delete(0,d.length());
//		}
//		for (int j = 0; j < g.length; j++) {
//			System.out.println(g[j]);
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		String[] b = new String[a];
//		while(a>=0) {
//			String c = sc.next();
//			StringBuffer er = new StringBuffer();
//			int erl=0;
//			String ba= "";
//			for (int i = 0; i < c.length(); i++) {
//				switch (c.charAt(i)) {
//				case '0':
//					er.append("0000");
//					break;
//				case '1':
//					er.append("0001");
//					break;
//				case '2':
//					er.append("0010");
//					break;
//				case '3':
//					er.append("0011");
//					break;
//				case '4':
//					er.append("0100");
//					break;
//				case '5':
//					er.append("0101");
//					break;
//				case '6':
//					er.append("0110");
//					break;
//				case '7':
//					er.append("0111");
//					break;
//				case '8':
//					er.append("1000");
//					break;
//				case '9':
//					er.append("1001");
//					break;
//				case 'A':
//					er.append("1010");
//					break;
//				case 'B':
//					er.append("1011");
//					break;
//				case 'C':
//					er.append("1100");
//					break;
//				case 'D':
//					er.append("1101");
//					break;
//				case 'E':
//					er.append("1110");
//					break;
//				case 'F':
//					er.append("1111");
//					break;
//				default:
//					break;
//				}
//			}
//			if (er.length()%3==1) {
//				er.insert(0, "00");
//			} else if(er.length()%3==2){
//				er.insert(0, "0");
//				System.out.println("er"+er);
//			}
//			erl = er.length()/3;
//			System.out.println(erl);
//			int d=0;
//			if (er.substring(0, 3).equals("000")) {
//				d= 1;
//			}
//			for(int i = d;i<erl;i++) {
//				switch (er.substring(i*3, i*3+3)) {
//				case "000":
//					ba+="0";
//					break;
//				case "001":
//					ba+="1";
//					break;
//				case "010":
//					ba+="2";
//					break;
//				case "011":
//					ba+="3";
//					break;
//				case "100":
//					ba+="4";
//					break;
//				case "101":
//					ba+="5";
//					break;
//				case "110":
//					ba+="6";
//					break;
//				case "111":
//					ba+="7";
//					break;
//				default:
//					break;
//				}
//				b[a]=ba;
//				System.out.println(ba);
//			}
//			a--;
//		}
//		for (int i =  b.length; i <0; i--) {
//			System.out.println(b[i]);
//		}
//	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int cnt=0;cnt<n;cnt++){
            String str = sc.next();
            StringBuilder str2 = To_binary(str);
            To_Octal(str2);
        }
    }
    /**
     * 将十六机制专为二进制
     * @param str
     * @return
     */
    public static StringBuilder To_binary(String str){     //16进制转换为2进制
        StringBuilder str2 = new StringBuilder();      //StringBuilder用来申明可变字符串
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            switch(c){
                case '0':
                    str2.append("0000");break;
                case '1':
                    str2.append("0001");break;
                case '2':
                    str2.append("0010");break;
                case '3':
                    str2.append("0011");break;
                case '4':
                    str2.append("0100");break;
                case '5':
                    str2.append("0101");break;
                case '6':
                    str2.append("0110");break;
                case '7':
                    str2.append("0111");break;
                case '8':
                    str2.append("1000");break;
                case '9':
                    str2.append("1001");break;
                case 'A':
                    str2.append("1010");break;
                case 'B':
                    str2.append("1011");break;
                case 'C':
                    str2.append("1100");break;
                case 'D':
                    str2.append("1101");break;
                case 'E':
                    str2.append("1110");break;
                case 'F':
                    str2.append("1111");break;
                default:break;
            }
        }
        return str2;
    }
    /**
     * 将二进制专为八进制
     * @param str
     */
    public static void To_Octal(StringBuilder str){  //转为8进制，转1位输出1位
        System.out.println(str);
        int len = str.length();
        int ans=0,s = 0;
        if(len % 3==1){                          //最高位的补零模拟
            //charAt(0)返回此序列中指定索引处的 char 值。
            ans = str.charAt(0)-'0';
            s+=1;
        }else if(len % 3==2){
            ans = (str.charAt(0)-'0')*2 + (str.charAt(1)-'0');
            s+=2;
        }
        //对结果进制输出
        if(ans>0)
            System.out.print(ans);
        boolean flog = true;
        for(int i=s;i<str.length();i+=3){
            ans =(str.charAt(i)-'0')*4+ (str.charAt(i+1)-'0')*2 + (str.charAt(i+2)-'0');
            if(flog){
                if(ans==0){
                    continue;
                }else{
                    flog = false;
                }
            }
            System.out.print(ans);
        }
        System.out.println();
    }

}
/**
 * 十六进制转八进制:http://lx.lanqiao.cn/problem.page?gpid=T51
 *问题描述
 　　给定n个十六进制正整数，输出它们对应的八进制数。

 输入格式
 　　输入的第一行为一个正整数n （1<=n<=10）。
 　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。

 输出格式
 　　输出n行，每行为输入对应的八进制正整数。

 　　【注意】
 　　输入的十六进制数不会有前导0，比如012A。
 　　输出的八进制数也不能有前导0。

 样例输入
 　　2
 　　39
 　　123ABC

 样例输出
 　　71
 　　4435274

 　　【提示】
 　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
 */