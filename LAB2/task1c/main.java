package LAB2.task1c;

import java.util.HashSet;
import java.util.Set;

public class main {
    public  static void  main(String[] args){

        Device d1 =  new Device("Apple" , "macbook" , 2023);
        Device d2 =  new Device("Apple" , "macbook" , 2023);
        Device d3 =  new Device("Apple" , "macbook" , 2025);


        phone p1 = new phone("Apple" , "iphone 15" , 2024 , "iOS 17");
        phone p2 = new phone("Apple" , "iphone 15" , 2024 , "iOS 17");
        phone p3 = new phone("Apple" , "iphone 17" , 2025 , "iOS 17");


        Set<Device> set = new HashSet<>();

        System.out.println(d1);
        set.add(d1);
        System.out.println(d2);
        set.add(d2);
        System.out.println(d3);
        set.add(d3);


        System.out.println(p1);

        set.add(p1);

        System.out.println(p2);
        set.add(p2);
        System.out.println(p3);
        set.add(p3);


            System.out.println("d1 eduals d2 " + d1.equals(d2));
            System.out.println("d1 eduals d3 " + d1.equals(d3));

            System.out.println("p1 eduals p2 " + p1.equals(p2));
            System.out.println("p1 eduals p3 " + p1.equals(p3));

        }
    }

