public class main {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("number = " + numberAsString );

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        System.out.println(numberAsString+=1);
        System.out.println(number+=1);
    }
}
