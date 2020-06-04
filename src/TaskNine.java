public class TaskNine {
    public static String stringEnds (String str){
        if (str.endsWith(".")){
            return str;
        }
        else {
            StringBuilder result = new StringBuilder();
            return result.append(str).append(".").toString();
        }
    }
    public static void main(String[] args) {
        String withDot = "With dot.";
        String withOutDot = "Without dot";
        System.out.println("String ends with \".\" -> " + stringEnds(withDot));
        System.out.println("String ends without \".\" -> " + stringEnds(withOutDot));
    }
}
