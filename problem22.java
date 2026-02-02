import java.util.Scanner;

class StarTriangle {
    private int w;

    public StarTriangle(int w) {
        this.w = w;

    }

    public String TS() {
        String res = "";

        for (int i = 0; i <= this.w; i++) {
            for (int j = 0; j < i; j++) {
                res += "[*]";
            }
            res += "\n";
        }
        return  res;
    }
}
public class problem22 {
    public  static void main(String[] args){
        Scanner cs = new Scanner(System.in);

        System.out.print("width: ");
        if(cs.hasNextInt()){
            int g = cs.nextInt();

            StarTriangle small = new StarTriangle(g);

            System.out.println((small.toString()));
        }
        cs.close();
    }
}
