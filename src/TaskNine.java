public class TaskNine {
    public static String dotEnd(String string) {
        if (string.isEmpty()){
            return string + ".";
        }
        if (string.substring(string.length() - 1).equals(".")) {
            return string;
        } else {
            return string + ".";
        }
    }

    public static void main(String[] args) {
        System.out.println(dotEnd("Basic"));

    }
}
