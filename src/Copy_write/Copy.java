package Copy_write;

import java.io.FileInputStream;
import java.io.*;

public class Copy {

    public static void copyFile(String source,String dest) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {

            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] file = new byte[1024];
            int leng;
            while ((leng = input.read(file)) > 0) {
                output.write(file, 0, leng);
            }
        } finally {
            input.close();
            output.close();
        }
    }

    public static void main(String[] args) throws IOException {
        //copyFile(new File(/home/ploy/Downloads/Redy.txt"), new File("/home/ploy/Downloads/Big.txt"));
        copyFile(args[0],args[1]);
    }
}
