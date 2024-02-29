package dragonGame;

public class Dragon {
    int x, y, width, height;

    public static void main(String[] args) {
        
        Dragon dragon = new Dragon();
        dragon.x = 9;
        dragon.y = 3;
        dragon.width = 10;
        dragon.height = 8;

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

    void moveLeft() {
        if (x > 0) {
            
            x--;
            System.out.println(x);
        }
        detectCollision();
    }

    void moveRight() {
        if (x < 0) {
            x++;
        }
        detectCollision();
    }

    void moveUp() {
        if (y > 0) {
            y--;
        }
        detectCollision();
    }

    void moveDown() {
        if (y < 0) {
            y++;
        }
        detectCollision();
    }

    void printPosition() {
        System.out.println("Dragon position: (" + x + ", " + y + ")");
    }

    void detectCollision() {
         if (x < 0 || x > width || y <0 || y > height) {
            System.out.println("Game Over");
        
        }
   }
}

