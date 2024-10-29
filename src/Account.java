public class Account {
    private long acc_no;
    private String name, email;
    private float amount;
    public long get_AccNo(){
        return acc_no;
    }
    public void setAcc_no(long acc_no){
        this.acc_no = acc_no;
    }
    public String get_name(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String get_Email(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }
}
