public class ColorScheme {
    private String primaryColor;
    private String secondaryColor;

    public ColorScheme(String primaryColor, String secondaryColor) {
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }
}
