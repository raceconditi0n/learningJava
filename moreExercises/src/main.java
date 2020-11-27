public class main {
    public static void main(String[] args) {
        int n = 4;
        int finishNumber = 20;
        int totalEvens = 0;

        while (n <= finishNumber) {
            n++;
            if (!isEven(n)) {
                continue;
            }
            totalEvens++;
            System.out.println("even number: "+ n);
            if(totalEvens==5){
                System.out.println("There are "+totalEvens+" even numbers.");
                break;
            }
        }
    }

        public static boolean isEven(int number){
            if (number % 2 == 0) {
                return true;
            }
            return false;
        }
}


