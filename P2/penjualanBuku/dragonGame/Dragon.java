package dragonGame;

public class Dragon {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon(int initialX, int initialY, int gameWidth, int gameHeight) {
        x = initialX;
        y = initialY;
        width = gameWidth;
        height = gameHeight;
    }

    public void moveLeft() {
        if (x > 0) {
            x--;
        }
        detectCollision();
    }

    public void moveRight() {
        if (x < width) {
            x++;
        }
        detectCollision();
    }

    public void moveUp() {
        if (y > 0) {
            y--;
        }
        detectCollision();
    }

    public void moveDown() {
        if (y < height) {
            y++;
        }
        detectCollision();
    }

    public void printPosition() {
        System.out.println("Dragon position: (" + x + ", " + y + ")");
    }

    private void detectCollision() {
        if (x <= 0 || x >= width || y <= 0 || y >= height) {
            System.out.println("Game Over");
        }
    }

    public static void main(String[] args) {
        Dragon dragon = new Dragon(5, 3, 10, 8);
        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();

        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.printPosition();
    }
}
