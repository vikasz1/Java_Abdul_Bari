
class Account{
    public String accountNo;
    public String name;
    public String phoneNo;
    private String DOB;

    //Getters
    public String getAccountNo(){
        return accountNo;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public String getDOB(){
        return DOB;
    }
    //Setters
    public void setAccountNo(String s){
        accountNo = s;
    }
    public void setName(String s){
        name = s;
    }
    public void setPhoneNo(String n){
        phoneNo = n;
    }
    public void setDOB(String s){
        DOB = s;
    }
    // Constructor
    public Account(String accountNo,String name,String phoneNo,String DOB){
        this.accountNo = accountNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.DOB = DOB;
    }
    public Account(){    }
    //Methods
    public void closeAccount(){
        System.out.println("Account closed");
    }
}



public class Chapter12_Account {
    public static void main(String[] args) {
        
    }
}
