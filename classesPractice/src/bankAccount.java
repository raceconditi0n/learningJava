public class bankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public bankAccount(){
        System.out.println("Empty Constructor called");
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public double depositFunds(double deposit) {
        return this.balance = deposit + balance;
    }
    public double withdrawFunds(double withdraw){
        if(this.balance < 0){
            return -1;
        }
        this.balance =  balance - withdraw;
        if(this.balance > 0){
            return this.balance;
        }
        return -1;
    }
}
