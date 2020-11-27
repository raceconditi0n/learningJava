public class main {
    public static void main(String[] args) {
        bankAccount tyler = new bankAccount();
         tyler.setAccountNumber(12345);
         tyler.setBalance(100.0);
        System.out.println("Your account balance is: "+tyler.getBalance());
        System.out.println("Tylers account number is "+ tyler.getAccountNumber());
        tyler.depositFunds(10.0);
        System.out.println(tyler.getBalance());
        tyler.withdrawFunds(120.0);
        System.out.println(tyler.getBalance());
        VipCustomer assHole = new VipCustomer("ass hole", 5, "dumbfuck@hotmail");
        System.out.println(assHole.getEmailAddress());
    }
}
