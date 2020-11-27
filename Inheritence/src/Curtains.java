public class Curtains {
    private int quantity;
    private ColorScheme colorscheme;

    public Curtains(int quantity, ColorScheme colorscheme) {
        this.quantity = quantity;
        this.colorscheme = colorscheme;
    }

    public int getQuantity() {
        return quantity;
    }

    public ColorScheme getColorScheme() {
        return colorscheme;
    }

    public void openCurtains(){
        System.out.println("Its bright as fuck");
    }
}
