public class TaskSeven {
    public static void main (String[] args) {
        String a = "john_smith@example.com";
        int atindex = a.indexOf("@");
        String login = a.substring(0, atindex);
        System.out.println(login);
        String domain = a.substring(atindex + 1, a.length());
        System.out.println(domain);
        int bottomDashIndex = login.indexOf("_");
        String name = login.substring(0,1).toUpperCase() + login.substring(1, bottomDashIndex);
        System.out.print(name + " " );
        String surname = login.substring(bottomDashIndex +1, bottomDashIndex +2).toUpperCase() +login.substring(bottomDashIndex +2, login.length());
        System.out.print(surname);
    }
}
