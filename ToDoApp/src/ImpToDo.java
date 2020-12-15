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
import java.io.PrintWriter;

 

public class ImpToDo extends JFrame {

	
	
	
	Date date = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("dd/MM");
	static String tiedosto = "src/Taskit.txt";
 

    public static void main(String[] args) {        // miten saadaan n‰m‰ koodit Jframeen? ohjelman "pohjalleko vaan"? 
    	File file = new File("out.txt");        //created a File object called file   
//        FileWriter fw = new FileWriter(file);    // created a FileWriter object called fw
//        PrintWriter pw = new PrintWriter(fw);    //created a PrintWriter object called pw
       
        SubTeht‰v‰ ToDo1 = new SubTeht‰v‰("Imuroi", "Kotona", "T‰rke‰"); // Luodaan SubClassilla Teht‰v‰. Syˆtet‰‰n 3 eri parametri‰ (kaikki String muodossa).
        SubTeht‰v‰ ToDo2 = new SubTeht‰v‰ ("Tee Olio projektia", "Koulussa", "Todella t‰rke‰");
//        pw.println(ToDo2); // tulostaa subTeht‰v‰, ei samaa kuin consolissa.
//        pw.println(ToDo1);
//        pw.close();
       
        ToDo1.printtaaData(); // printtaa consoliin tiedot, miten n‰m‰ saa textArea Teht‰v‰t sis‰lle?
        ToDo2.printtaaData(); //
//        try {
//            ToDo1.setT‰rkeysArvo(t‰rkeys);
//            ToDo1.printData();
//        	PrintStream myconsole = new PrintStream(tiedosto);
//        	System.setOut(myconsole);
//        	
//        } catch (FileNotFoundException fx) {
//        	System.out.println(fx);
//        }
        
        
        
        
        
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

 

} // End of main

 

class Teht‰v‰ {        //SuperClass
    public String teht‰v‰;
    public String paikka;
    
    public Teht‰v‰()    //default constructor with no parameters
    {
        teht‰v‰="";
        paikka="";
    }
    public Teht‰v‰ (String teht) //one parameter
    { 
        teht‰v‰=teht;
        paikka="";
    }
    public Teht‰v‰ (String teht‰v‰, String paikka) // Constructor with 2 parameters
    {
        this.teht‰v‰=teht‰v‰;
        this.paikka=paikka;
    }
    protected void printtaaData() //tulosta consoliin metodi. Protected jotta voidaan peri‰, muttei muuttaa luokan ulkopuolella
    {
            System.out.println("Teht‰v‰: " + teht‰v‰);
            System.out.println("Paikka: " + paikka);
    }    
}             //End of SuperClass 

 

class SubTeht‰v‰ extends Teht‰v‰  //SubTeht‰v‰ class periytyy Superclass Teht‰v‰st‰
    {
    private String t‰rkeys;
    
    public SubTeht‰v‰()    //DEFAULT constructor
    {
        teht‰v‰="";
        paikka="";
        t‰rkeys="";
    }
    
    public SubTeht‰v‰(String teht‰v‰) // one parameter
    {
        this.teht‰v‰=teht‰v‰;
        paikka="";
        t‰rkeys= "";
    }
    
    public SubTeht‰v‰(String teht‰v‰, String paikka, String t‰rkeys)  // Constructor with 3 parameters. T‰st‰ luodaan teht‰v‰ Consoliin. 
    {
        this.teht‰v‰=teht‰v‰;
        this.paikka=paikka;
        this.t‰rkeys=t‰rkeys;
    }
        
    @Override
    public void printtaaData()
    {
        System.out.println("T‰rkeys: " + t‰rkeys);
        super.printtaaData(); // Hakee printdata metodin ToDo Classista ja lis‰t‰‰n t‰rkeys erikseen.
        System.out.println("- - - - - - - - - - - - - - -");
    }
    public void kirjoitaTiedostoon(String txt, String filename) {
        try {
            // Valinta true lopussa aiheuttaa sen, ett‰ ei ylikirjoiteta vaan jatketaan olemassa olevan per‰‰n
            FileWriter fwriter = new FileWriter(filename, true);
            fwriter.write(txt + "\n");
            fwriter.close();
            System.out.println(txt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

