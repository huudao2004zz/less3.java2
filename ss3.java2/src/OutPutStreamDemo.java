import java.io.*;

public class OutPutStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("C:\\Users\\ASUS\\IdeaProjects\\untitled\\ss3.java2\\src\\file.txt");
        byte b [] = {65,70,89,68};
        //Thực hiện ghi vào dòng(stream)
        outputStream.write(b);
        //xả sạch dòng
        outputStream.flush();
        //ghi một chuỗi liên tục
        for(int i = 65;i<90;i++){
            outputStream.write(i);
        }
        outputStream.flush();
        outputStream.close();
    }
}
