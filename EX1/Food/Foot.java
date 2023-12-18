import java.util.Scanner;

public class Foot {
    private FootShape footshape;

    public Foot(FootShape footshape) {
        this.footshape = footshape;
    }

    public String drawshape() {
        return footshape.draw();
    }

    public static String getShapeFromUser() {
        String Shape = null;
        System.out.println("What to draw? 1.Ellipse, 2.Rectangle");
        Scanner inp = new Scanner(System.in);
        int type = inp.nextInt();
        switch (type) {
            case 1:
                Shape = "Ellipse";
                break;

            case 2:
                Shape = "Rectangle";
                break;
        }
        return Shape;
    }

    public static void main(String[] args) {
        String shape = getShapeFromUser();
        FootShape footshape = null;
        switch (shape) {
            case "Ellipse":
                footshape = new Ellipse();
                break;
            case "Rectangle":
                footshape = new Rectangle();
                break;
        }
        Foot ans = new Foot(footshape);
        System.out.println(ans.drawshape());
    }
}