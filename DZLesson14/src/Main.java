
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\tamen\\Desktop\\Java\\DZLesson14\\img.png");
            FileOutputStream fileOutputStream = new FileOutputStream("img_new.png");
            ){
            byte[] bytes = new byte[35000];
            int count;
            while ((count=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes, 0, count);
            }
            System.out.println("Final");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
