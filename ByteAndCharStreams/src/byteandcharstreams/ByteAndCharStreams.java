/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package byteandcharstreams;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
/**
 *
 * @author Aslam
 */
public class ByteAndCharStreams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        byte b[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        ByteArrayInputStream  byteinput=new ByteArrayInputStream(b);
        int x;
        while((x=byteinput.read())!=-1){
            System.out.print(x);
            System.out.print((char)x);
        }
        System.out.println("\nprint using read All Bytes");
        String str= new String(byteinput.readAllBytes());
        if(str.length()==0) System.out.println("ByteArrayInputStream i s empty");
        else System.out.println("Str i s "+ str);
        
        ByteArrayOutputStream byteoutput=new ByteArrayOutputStream(20);
        byteoutput.write(b);
        System.out.println(b);
        System.out.println("byteoutput is " + byteoutput);
        byte newb[]=byteoutput.toByteArray();
        for(byte each: newb){
            System.out.printf(" %3d", each);
            System.out.println((char)each);
        }
        System.out.println(byteoutput);
        //writing to a file
        //replace "/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/ByteOutputData.txt" with location you prefer to save the output of this byte array
        //also REMOVE C: AND START THE FILE LOCATION from HOME DIRECTORY /USER/... and so on
        byteoutput.writeTo(new FileOutputStream("/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/ByteOutputData.txt"));
        System.out.println("still byteoutput has data "+byteoutput);
        System.out.println("still byteoutput has data "+byteoutput);
        byteoutput.flush();
        System.out.println("still byteoutput has data "+byteoutput);
        byteoutput.reset();
        System.out.println("still byteoutput has data "+byteoutput);

    }
    
}
