public class main {
    public static void main(String[] args) {


        Bed bed = new Bed("king", 1, new ColorScheme("black", "red"));
        Desk desk = new Desk(4, "brown");
        ColorScheme dark = new ColorScheme("black", "grey");


        Bedroom bedroom = new Bedroom(bed, desk, new Curtains(3, dark), dark);

        bedroom.layDown();

    }
}