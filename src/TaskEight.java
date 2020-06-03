public class TaskEight {
    public static void Names(String a) {
        String[] result;
        result = a.split(", ");
        for (String b : result) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        System.out.println("Sort Names");
        String a = "Den, John, Will, Kate, Adam, Robin";
        Names(a);
    }

}
