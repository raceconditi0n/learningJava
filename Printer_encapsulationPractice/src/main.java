public class main {
    public static void main(String[] args) {
        Printer lenovoPrinter = new Printer(50, 100, true);
        lenovoPrinter.checkTonerLevel();
        lenovoPrinter.fillToner(50);
        lenovoPrinter.getPagesPrinted();
        lenovoPrinter.printPage(10);
        lenovoPrinter.getPagesPrinted();
        lenovoPrinter.checkTonerLevel();
    }
}
