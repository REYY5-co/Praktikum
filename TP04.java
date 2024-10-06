import java.util.Scanner;

public class  TP04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        
        int N = input.nextInt();

        
        if (N % 6 == 0) {
            System.out.println(N + "  Kelipatan enam");
        } else {
            System.out.println(N + " Bukan kelipatan enam");
        }

        
        input.close();
    }
}
