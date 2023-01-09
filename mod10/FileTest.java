import java.io.File;
import java.io.IOException;


public class FileTest {
    //Це не обовʼязковий клас, потрібен був для тренування на стоврення files i dir
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/art_of_d/Java/mod10/DirJson");
        if (!file.exists()){
            file.exists();
        }
        System.out.println(file.exists());

        File file1 = new File("/Users/art_of_d/Java/mod10/DirJson/GsonMain.java");
        if (!file1.exists()){
            file1.createNewFile();
        }
        System.out.println(file1.exists());

        File file2 = new File("/Users/art_of_d/Java/mod10/DirJson/file.txt");
        if (!file2.exists()) {
            file2.createNewFile();
        }
        System.out.println(file2.exists());


    }

}
