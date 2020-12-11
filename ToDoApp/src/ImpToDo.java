import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

 

public class ImpToDo extends JFrame {

	Date date = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("dd/MM");
	static String tiedosto = "src/Taskit.txt";
 

    public static void main(String[] args) {        // miten saadaan n�m� koodit Jframeen? ohjelman "pohjalleko vaan"? 
        ImprovedToDo ToDo1 = new ImprovedToDo("Imuroi", "Koti", 3);
        
        Scanner in = new Scanner(System.in);
        
        int t�rkeys;
        System.out.println("Sy�t� T�rkeysaste: " + " 1 = Ei kiireinen. " + " 2 = Kiireinen. " + " 3 = Eritt�in kiireinen. ");
        t�rkeys = Integer.parseInt(in.nextLine());
        
 //       ToDo1.setT�rkeysArvo(t�rkeys);
 //       ToDo1.printData();
        
        try {
            ToDo1.setT�rkeysArvo(t�rkeys);
            ToDo1.printData();
        	PrintStream myconsole = new PrintStream(tiedosto);
        	System.setOut(myconsole);
        	
        } catch (FileNotFoundException fx) {
        	System.out.println(fx);
        }
        
        
        
        
        
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

 

} // End of main

 

class ToDo
    {
        public String teht�v�;
        public String paikka;
    
        public ToDo() //default Constructor no parameters
    {
            teht�v�="";
            paikka="";
    }
    //parameterized constructors
    public ToDo(String teht) //constructor with 1 parameter
    {
            teht�v�=teht;
            paikka="";
    }
    
    public ToDo(String teht�v�, String paikka) //constructor with 2 parameters
    {
        this.teht�v�=teht�v�;
        this.paikka=paikka;    
    }
        
    protected void printData() //tulosta consoliin metodi. Protected jotta voidaan peri�, muttei muuttaa luokan ulkopuolella
    {
            System.out.println("Teht�v�: " + teht�v�);
            System.out.println("Paikka: " + paikka);
    }    
} //end of SuperClass

 

    class ImprovedToDo extends ToDo //subclass periytynyt superclassista
    {
        private int t�rkeys;
		private Object date;
		private DateFormat sf;
		private String tiedosto;
        
        public ImprovedToDo()    //default constructor
        {
            teht�v�="";
            paikka="";
            t�rkeys= 0;
        }
        
        public ImprovedToDo(String teht�v�) // one parameter
        {
            this.teht�v�=teht�v�;
            paikka="";
            t�rkeys= 0;
        }
        
        public ImprovedToDo(String teht�v�, String paikka, int t�rkeys)
        {
            this.teht�v�=teht�v�;
            this.paikka=paikka;
            this.t�rkeys=t�rkeys;
        }
            
        public void setT�rkeysArvo(int n)
        {
            t�rkeys=n;
            if(n==1) 
            {
                System.out.println("Ei kiireinen");
            }
            if (n==2)
            {
                System.out.println("Kiireinen ");
            }    
            if (n==3)
            {
                System.out.println("Todella kiireinen ");
            }
//            else 
//            {
//                System.out.println("Sy�t� numero 1, 2 tai 3");
//            }
        }        
        @Override
        public void printData()
        {
        	
        super.printData(); // Hakee printdata metodin ToDo Classista
            System.out.println("T�rkeys: " + t�rkeys);
        

        }
    
    public void kirjoitaTiedostoon(String tiedosto) {
		try {
//			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(tiedosto, true);
			fwriter.write(sf.format(date) + " Task:  " + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
   
    
}


