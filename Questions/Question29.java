public class Question29 {
    public static void main(String[] args) {
        String s="Saikait";
        int a=s.length();
        String result="";
        for (int i = 0; i <a; i++) {
            char ch = s.charAt(i);
            if (ch !='a' && ch!='e'&& ch!='i'&& ch!='o'&& ch!='u') {
                result+=ch;
            }
        }
        System.out.println(result);
    } 
}