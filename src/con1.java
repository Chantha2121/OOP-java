public class con1 {
    private String _name;
    private String _membership;
    con1(String name , String membership){
        set_name(name);
        set_membership(membership);
    }
    // Get name method
    String get_name(){
        return _name;
    }
    // Set name method
    void set_name(String name){
        _name = name;
    }
    // Get membership method
    String get_membership(){
        return _membership;
    }

    // Set membership method
    void set_membership(String membership){
        _membership = membership;
    }
}
