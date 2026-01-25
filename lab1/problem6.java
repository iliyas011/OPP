import java.util.Scanner;

public class problem6 {


    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        boolean p = true;
        for(int i = 0 ; i < name.length() / 2; i++){
            if(name.charAt(i) != name.charAt(name.length()- i -1)){
                p = false;
                break;
            }
        }

        if(p){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
