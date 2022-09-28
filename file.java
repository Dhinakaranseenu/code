import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class file {
    public static void main(String[] args)  {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
       String na = sc.nextLine();
       String nam = sc.nextLine();
       String tx = sc.nextLine();
       FileOutputStream fos = new FileOutputStream(na,true); 
       FileOutputStream fos1 = new FileOutputStream(nam,true); 
       System.out.println("Enter the content");
       String str = sc.nextLine();
       byte[] b= str.getBytes();        


InputStream is = new FileInputStream(na);
        OutputStream os = new FileOutputStream(nam);

        int i =0 ;
        System.out.println("The files are ready......");
        while ((i = is.read())!=-1){
            os.write(i);

        }
        System.out.println(" the contents are copied from na to nam"); 
        
        tx = System.console().readLine();
 
        System.out.println("You entered string " + tx);

        FileWriter fw = new FileWriter(tx);
        fw.write("We love java"); 
        fw.close();   
        System.out.println("\nFile write done");   
        fos.write(b);
        fos1.write(b);            
        fos.close();
        fos.close();             
        System.out.println("file saved.");  
        }  
        catch(Exception e)  
        {  
        e.printStackTrace();          
        } 
        
    }
    
}
