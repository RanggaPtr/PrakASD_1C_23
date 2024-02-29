package dragonGame;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class mainDragon {
    public static void main(String[] args) {
        System.out.println("WELCOME TO DRAGON GAME JAVA BY RANGGA : ");
        System.out.println("==================================================");
        Scanner input = new Scanner(System.in);
        Dragon dragon = new Dragon();
        dragon.x = 9;
        dragon.y = 3;
        dragon.width = 10;
        dragon.height = 8;
        
        String inputan;
        System.out.println("Masukkan Arah WASD");
        inputan = input.nextLine();
        if (inputan.equalsIgnoreCase("w")) {
            dragon.move
        }




        System.out.println("POSISI AWAL : ");
        dragon.printPosition();

        dragon.moveLeft();
        // dragon.printPosition();

        dragon.moveUp();
        // dragon.printPosition();

        dragon.moveRight();
        // dragon.printPosition();

        dragon.moveDown();

        System.out.println("POSISI AKHIR : ");
        dragon.printPosition();
    }
}
