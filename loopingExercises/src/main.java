public class main {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int sumDigits(int number) {
        if(number <= 10){
            return -1;
        }
        int popHundreds = number % 10; //for 128 this returns 8
        int discardLSD = number / 10; // for 128 thi grabs 12
        int popTens = discardLSD % 10; // for 128 this grabs 2
        int discardSecondLSD =  discardLSD / 10; // i think this grabs the 1?
        return discardSecondLSD + popTens + popHundreds;

    }

}
