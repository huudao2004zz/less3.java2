package s3;
import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        InputStream inputStream  = null;
        try{
            //ném file.txt vào dòng đọc InputStream
            inputStream = new FileInputStream("C:\\Users\\ASUS\\IdeaProjects\\untitled\\ss3.java2\\src\\file.txt");
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());



        }catch (Exception e ){
            e.printStackTrace();
        }finally {
            if(inputStream != null){
                inputStream.close();
            }
        }
    }
}
