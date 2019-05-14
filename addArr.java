package season_2.ThemPhanTuVaoMang;

import java.util.Scanner;

public class addArr {
    public static void main(String[] args) {
       int [] value = new int [5];
       value[0] = 1;
       value[1] = 2;
       value[2] = 3;
       value[3] = 4;

       for (int i=0;i<value.length;i++){
           System.out.println("value["+i+"] = "+ value[i]);
       }

       System.out.print("Nhap vi tri muon them: ");
       Scanner sc = new Scanner(System.in);
       int index = sc.nextInt();


       if (index>1 && index <value.length){
           System.out.print("Nhap gia tri can them: ");
           int newValue = sc.nextInt();
           for (int i=value.length-1;i>index;i--){
               value[i] = value[i-1];
           }
           value[index] = newValue;
           for (int i=0;i<value.length;i++){
               System.out.print("\nvalue[" +i+"] = " +value[i]);
           }
       } else {
           System.out.print("Khong chen duoc phan tu vao mang");
       }


    }
}
