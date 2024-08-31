public class PrintCharacter {

    public static void PrintChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str ="Saikat Adhya";
        PrintChar(str);
    }
}
