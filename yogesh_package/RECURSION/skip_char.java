package yogesh_package.RECURSION;
public class skip_char {
    public static void main(String[] args) {
        String up = "baccad";
        String p = "";
        func(p, up);
    }

    static void func(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.charAt(0) == 'c') {
            func(p, up.substring(1)); 
        } else {
            func(p + up.charAt(0), up.substring(1));
        }
    }
}
