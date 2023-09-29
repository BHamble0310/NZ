import java.util.Arrays;
import java.util.Scanner;

public class FMA {
    public static void main(String[] args) {
        System.out.print("请输入数组大小：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++) {
            System.out.print("请输入数组第" + (i + 1) + "个元素：");
            int x = scanner.nextInt();
            b[i] = x;
        }
        int max=0;
        for(int i=0;i<a;i++){
            int sum=0;
            sum+=b[i];
            for(int j=i+1;j<a;j++){
                sum+=b[j];
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }
}

