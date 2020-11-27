public class main {
    public static void main(String[] args) {
        int conditionMet = 0;
        int conditionTotal = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                conditionMet++;
                conditionTotal+=i;
                System.out.println(i);
                if(conditionMet==5){
                    System.out.println(conditionTotal);
                    break;
                }
            }
        }

    }

    public static int whats(){
        int conditionMet = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                conditionMet++;
                System.out.println(i);
                if(conditionMet==5){
                    break;
                }
            }
        }
        return -1;
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

