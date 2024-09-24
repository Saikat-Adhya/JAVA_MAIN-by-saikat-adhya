public class Question32 {
    public static void main(String[] args) {
        String string ="ayhda takias";
        int length =string.length();
        int start=0;
        int end= length-1;
        char temp;
        char []ch = string.toCharArray();  //adhya
        while (start<end) {
            temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        System.out.println(ch);
    }
}
