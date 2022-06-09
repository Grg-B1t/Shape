import org.w3c.dom.css.Rect;

class Main{
    public static void main(String[] args) {
        Shape rec = new Rectangle(4.5, 5.0);

        System.out.println("The area of Rectangle : " + rec.area());
        System.out.println("The perimeter of Rectangle : " + rec.perimeter());
    }
}