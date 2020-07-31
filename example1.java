import java.util.Scanner;

public class example1 {
    void func() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter I values");
        int var1 = sc.nextInt();
        System.out.println("enter II value");
        int var2 = sc.nextInt();
        int res = var1 + var2;
        System.out.println("sum" + res);

    }

    void func2() {
        Scanner sc2=new Scanner(System.in);
        int [] a=new int[5];
        for (int i = 0;i < a.length; i++) {
            a[i]=sc2.nextInt();
        }
        for (int i = 0;i < a.length; i++) {
            System.out.println(a[i]);
        }
        }

    public static void main(String[] args) {
        example1 ob = new example1();
        ob.func();
        ob.func2();
    }
}
