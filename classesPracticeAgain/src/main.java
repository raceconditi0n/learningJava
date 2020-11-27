public class main {
    public static void main(String[] args) {

        Wall someWall = new Wall(5, 4);

        System.out.println("area = " + someWall.getArea());

        someWall.setHeight(-1.5);
        System.out.println(someWall.getHeight());
        System.out.println(someWall.getWidth());
        System.out.println(someWall.getArea());
    }
}
