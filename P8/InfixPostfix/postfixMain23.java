package P8.InfixPostfix;

import java.util.Scanner;
public class postfixMain23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika (infix) :");
        Q = sc23.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        postfix23 post = new postfix23(total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}
