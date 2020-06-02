public class TaskFive {
    public static void main (String[] args) {
        String a = "ABCDEFGHIJK";
        a = a.toLowerCase();
        a = a.replaceAll("[aeiou]","");
        System.out.println(a);
    }
}
