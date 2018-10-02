package bug;

public class ShowMeYourBug {

    public static void main(String[] args) {
        System.out.println(isOk("Cheers"));
    }

    public static boolean isOk(String s) {
        return s.isBlank();
    }
}
