import java.util.Scanner;

public class YildizlarIleElmasYapma {
    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);

        int n;
        int result = 1;

        System.out.print("Bir sayı giriniz : ");
        n = imp.nextInt();

        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= n - (n - i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n - i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
