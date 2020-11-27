public class Bedroom {
    private Bed bed;
    private Desk desk;
    private Curtains curtains;
    private ColorScheme colorScheme;

    public Bedroom(Bed bed, Desk desk, Curtains curtains, ColorScheme colorScheme) {
        this.bed = bed;
        this.desk = desk;
        this.curtains = curtains;
        this.colorScheme = colorScheme;
    }

    public void layDown(){
        System.out.println("I'm laying down");
        bed.sleep();
    }
}
