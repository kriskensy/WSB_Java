package pl.kriskensy.cwiczeniowiec;

import java.io.*;

public class BuffCopy {
    public static void main(String[] args) {
        String sourceFile = "plikZrodlowy";
        String destFile = "plikDocelowy";

        try {
            //input stream z pliku
            FileInputStream fis = new FileInputStream(sourceFile);
            BufferedInputStream bis = new BufferedInputStream(fis);

            //output do pliku
            FileOutputStream fos = new FileOutputStream(destFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte[] buffer = new byte[1024];

            int length;
            while ((length = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, length);
            }

            bis.close();
            bos.close();
            System.out.println("content copied successfully");

        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
