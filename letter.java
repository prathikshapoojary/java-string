import java.io.*;
import java.util.*;

class MyClass{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.format("Enter the name:");
        name = in.nextLine();
        String uname = name.toUpperCase();
        System.out.println("You have entered "+name+" name is converted to upper case, that is "+uname); 
        
        String str;
        String strcopy=" ";
        System.out.format("Enter the string:  ");
        str = in.nextLine();

        System.out.format(str.replace(' ','_'));  
    }
}