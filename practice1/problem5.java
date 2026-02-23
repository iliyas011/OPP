package practice1;

import java.util.Scanner;

public class problem5 {

    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Integer balanace = sc.nextInt();
        Integer rate = sc.nextInt();

        Integer rate1 =  balanace * (rate)/100;
        System.out.println(balanace);
        System.out.println(rate1);
        System.out.println(balanace+rate1);


    }
}
