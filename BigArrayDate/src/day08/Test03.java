package day08;
/*
1.4	利用for循环打印ABCDEFG...XYZ，26个大写字母与26个小写字母
题目分析：
通过观察发现，本题目要实现打印26个大写字母、26个小写字母
1.	一共26个大小写字母，那么，可以考虑循环26次。在每次循环中，完成指定字母的大小写打印
2.	找出ABCDEFG…XYZ这些字母之间的变化规律
通过ASCII表发现，后面的字母比它前面的字母，ASCII值大1
下一个字母 = 上一个字母 + 1
如： A	B	C	D
	65	66	67	68
	3. 在每次循环中打印上一个字母大小写，并指定下一个字母
解题步骤：
1.	定义初始化大写变量，值为’A’； 初始化小写变量，值为’a’
2.	使用for循环，进行26次循环
3.	在每次循环中，打印大写字母、小写字母。
每次打印完成后，更新大写字母值、小写字母值

 */
public class Test03 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.println("大写：" + b +"  小写：" + a );
            b++;
            a++;


        }
    }

}