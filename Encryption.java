
import javax.swing.JOptionPane;
import java.io.File;
import java.io.*;
import java.io.FileWriter;
import java.lang.Math;
public class Encryption
{

    public static void main(String args[])
    {
        Enc e = new Enc();
        e.getData();
        e.showData();
        e.arr();
    }

}
class Enc
{
    String str;
    public void getData()
    {
        str=JOptionPane.showInputDialog("Enter Data for Encryption");
    };
    public void showData()
    {
        System.out.println(str);
    }
    public void arr()
    {
        String bin;
    char[] c=str.toCharArray();
    for(char ch : c)
    {
        int ascii=ch;
        ascii+=5;
       bin= Integer.toBinaryString(ascii);
        System.out.print(ch+"\t");
        System.out.print(ascii+"\t");
        System.out.print(bin+"\t");
        System.out.println();

        try{
            FileWriter fw = new FileWriter("D:/JavaExe/text.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.printf(bin+",");
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }


//    for(int i=0;i<c.lenght;i++)
//    {
//        System.out.println(c[i]);
//    }



    }
};
