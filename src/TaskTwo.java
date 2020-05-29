public class TaskTwo {
    public static void main (String[] args) {
        String a = "Ukraine";
        if (a.length() >1){
            System.out.print(a.substring(0,2));
        }
        else if (a.length() ==1){
            System.out.print(a.substring(0,1));
        }
        else { System.out.print("");
        }
    }
}
