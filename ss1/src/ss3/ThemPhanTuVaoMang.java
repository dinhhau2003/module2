package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        do {
            System.out.println("Nhập số lượng phần tử của mảng: ");
            n=Integer.parseInt(sc.nextLine());
        }while (n<=0);
        int [] A=new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (i = 0; i < n;i ++) {
            System.out.println("Nhập phần tử thứ "+i+": ");
            A[i]=Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng vừa nhập là: ");
        for ( i = 0; i <n ; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println("Nhập phần tử cần chèn vào mảng: ");
        int k=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào vi trí cần chèn phần tử: ");
        int index=Integer.parseInt(sc.nextLine());
        if (index<=-1 || index>=A.length-1){
            System.out.println("Vị trí không hợp lệ: ");
        }else {
            for ( i = A.length-1; i >index ; i--) {
                A[i]=A[i-1];
            }
            A[index]=k;
            System.out.println("Mảng sau khi chèn phần tử " + k + " vào vị trí " + index + ":");
//            System.out.println(Arrays.toString(A));
            for ( i = 0; i < n; i++) {
                System.out.println(A[i]+" ");
            }
        }
    }
}
