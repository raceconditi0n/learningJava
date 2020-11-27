public class Bed {
    private String size;
    private int hasSheets;
    private ColorScheme colorscheme;

    public Bed(String size, int hasSheets, ColorScheme colorScheme){
        this.size = size;
        this.hasSheets = hasSheets;
        this.colorscheme = colorScheme;
    }

    public String getSize() {
        return size;
    }

    public int getHasSheets() {
        return hasSheets;
    }

    public ColorScheme getColorscheme() {
        return colorscheme;
    }

    public void sleep(){
        System.out.println("You are sleeping");
    }
}
