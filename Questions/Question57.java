public class Question57 {

    public static void main(String[] args) {
        String s1 = "saikat";
        String s2 =  "rounak";
        int m= s1.length();
        int n=s2.length();
        StringBuilder sb = new StringBuilder();
        int i=0;int j=0;
        while (i<m && j<n) {
            if (i<m) {
                sb.append(s1.charAt(i++));
            }
            if (j<n) {
                sb.append(s2.charAt(j++));
            }
        }
        
        System.out.println(sb);
    }
}