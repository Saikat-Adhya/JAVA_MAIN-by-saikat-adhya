public class Question2String {
    public static void main(String[] args) {
        String s = "S!a@i#k$a%t^A*d&h(y)a";
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }

    
}