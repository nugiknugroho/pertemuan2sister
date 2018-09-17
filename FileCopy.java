/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author ASUS
 */
public class FileCopy {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        InputStream in = new FileInputStream("e:/document.txt");
        File file = new File("hasilCopy.txt");
            if(!file.exists()){
                file.createNewFile();
            }else{
                System.out.println("File Sudah ada");
            }
        OutputStream out = new FileOutputStream(file);
        int data = in.read();
        while(data!=-1){
            out.write(data);
            data = in.read();
            
        }
//        if (file.setExecutable(true)) {
//            System.out.println("Sukses");
//        }else{
//            System.out.println("Gagal");
//        }
      
        out.flush();
        out.close();
        in.close();
    }
  
}
