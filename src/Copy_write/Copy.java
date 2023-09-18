package Copy_write;

import java.io.FileInputStream;
import java.io.*;

public class Copy {

    public static void copyFile(String source,String dest) throws IOException {

        try (FileInputStream in= new FileInputStream(source);FileOutputStream out = new FileOutputStream(dest)) {
            byte[] file = new byte[1024];
            int leng;
            while ((leng = in.read(file)) > 0) {
                 out.write(file,0, leng);
            }
        }
            finally {
            System.out.println("Finish");
        }
    }

    public static void main(String[] args) throws IOException {
      //  copyFile(new File("/home/ploy/Downloads/Redy.txt"), new File("/home/ploy/Downloads/Big.txt"));
        copyFile(args[0],args[1]);
    }
}
