public class TaskSix {
    public static void main (String[] args) {
        String a = "Hop";
        System.out.println(a.length());
        String b = "Hello";
        System.out.println(b.length());
        if (a.length() <= b.length()) {
            System.out.print(a + b + a);
        }
        else {
            System.out.print(b + a + b);
        }
    }
}