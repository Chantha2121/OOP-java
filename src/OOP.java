public class OOP {
    public static void main(String[] args) {
        System.out.println("Hello World");
        User user = new User();
        user.set_name("Chantha");
        user.set_membership("Bro code");
        System.out.println(user.get_name());
        System.out.println(user.get_membership());

        User user1 = new User();
        user1.set_name("Chanthet");
        user1.set_membership("Boy loy");
        System.out.println(user1.get_name());
        System.out.println(user1.get_membership());

    }
}
