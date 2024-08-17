import java.io.*;
public class FileIO {
    public static void main(String[] args) {

        String st="";
        System.out.println("Enter text in your file.....");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new FileWriter(new File("ABC.txt"),true));
            BufferedReader brf =  new BufferedReader(new FileReader("ABC.txt"));
            st=br.readLine();
            while (st.length()!=0) {
                pw.write(st);
                st=br.readLine();
            }
            pw.close();
            System.out.println("Reading from your file.....");
            st=brf.readLine();
            while (st.length()!=0) {
                System.out.println(st);
                st=brf.readLine();
                
            }
        } catch (Exception e) {
           
        }
        
    }
}
