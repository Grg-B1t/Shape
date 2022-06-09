// main class

class Main{
    public static void main(String[] args) {
        Shape rec = new Rectangle(4.0, 5.0);

        System.out.println("The area of Rectangle is " + rec.area());
        System.out.println("The perimeter of Rectangle is " + rec.perimeter());
    }
}