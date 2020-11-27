public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void checkTonerLevel() {
        if(tonerLevel<30){
            System.out.println("Please refill toner, toner less than 30%");
        }
        System.out.println("Toner level is: " + tonerLevel);
    }

    public int fillToner(int fillAmount){
        if((fillAmount + tonerLevel) > 100){
            System.out.println("Do not overfill");
            return -1;
        }
        int filledAmount = tonerLevel += fillAmount;

        System.out.println("Filling toner to " + filledAmount );
        return filledAmount;
    }

    public int printPage(int numberOfPages){
        tonerLevel= tonerLevel - (numberOfPages / 2);
        if(isDuplexPrinter){
            int duplexNumberOfPages = numberOfPages / 2;
            System.out.println("Printing " + duplexNumberOfPages + " pages.");
            return pagesPrinted += duplexNumberOfPages;
        }
        System.out.println("Printing " + numberOfPages + " pages.");
       return pagesPrinted += numberOfPages;
    }

    public int getPagesPrinted() {
        System.out.println(pagesPrinted + " pages have been printed");
        return pagesPrinted;
    }
}
