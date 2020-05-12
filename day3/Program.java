
import java.io.*;
import java.util.jar.Attributes.Name;

import javax.print.DocFlavor.READER;
public class Program {
    public static void main(String[] args) {
        Console cin = System.console();
        System.out.println("Enter The Name :: ");
        String Name = cin.readLine();
        System.out.println(Name);
        cin.flush();
        System.out.println("Enter two numbers to be added");
        System.out.println("Enter the first Number");
        String FirstStringNum = cin.readLine();
        System.out.println("Enter the Second Number");
        String SecondStringNum = cin.readLine();
        int FirstNum = Integer.parseInt(FirstStringNum);
        int SecondNum = Integer.parseInt(SecondStringNum);
        int Result = FirstNum + SecondNum;
        System.out.println("Sum is :: " + Result);
        cin.printf("%d  :: %s", Result, Name);
    }   
}