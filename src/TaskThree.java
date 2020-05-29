public class TaskThree {
    public static void main (String[] args) {
        String a = "Welcome to Java World ";
        a = a.replaceAll("[ ]","");
        String b = "<p>";
        String c =  "</p>";
        String all = b + a + c;
        System.out.println(all);
    }
}