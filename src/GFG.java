public class GFG {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAcc_no(305544346);
        acc.setName("Chantha");
        acc.setEmail("Chantha12@gmail.com");
        acc.setAmount(3000);
        System.out.println(
                acc.get_name()+" "+acc.get_Email()
                +" "+acc.get_AccNo()+" "+ acc.getAmount()
        );
    }
}
