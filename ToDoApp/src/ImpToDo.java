import java.util.Scanner;

import javax.swing.JFrame;

 

public class ImpToDo extends JFrame {

	
 

    public static void main(String[] args) {        // miten saadaan nämä koodit Jframeen? ohjelman "pohjalleko vaan"? 
        ImprovedToDo ToDo1 = new ImprovedToDo("Imuroi", "Koti", 3);
        
        Scanner in = new Scanner(System.in);
        
        int tärkeys;
        System.out.println("Syötä Tärkeysaste: " + " 1 = Ei kiireinen. " + " 2 = Kiireinen. " + " 3 = Erittäin kiireinen. ");
        tärkeys = Integer.parseInt(in.nextLine());
        
        ToDo1.setTärkeysArvo(tärkeys);
        ToDo1.printData();
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

 

} // End of main

 

class ToDo
    {
        public String tehtävä;
        public String paikka;
    
        public ToDo() //default Constructor no parameters
    {
            tehtävä="";
            paikka="";
    }
    //parameterized constructors
    public ToDo(String teht) //constructor with 1 parameter
    {
            tehtävä=teht;
            paikka="";
    }
    
    public ToDo(String tehtävä, String paikka) //constructor with 2 parameters
    {
        this.tehtävä=tehtävä;
        this.paikka=paikka;    
    }
        
    protected void printData() //tulosta consoliin metodi. Protected jotta voidaan periä, muttei muuttaa luokan ulkopuolella
    {
            System.out.println("Tehtävä: " + tehtävä);
            System.out.println("Paikka: " + paikka);
    }    
} //end of SuperClass

 

    class ImprovedToDo extends ToDo //subclass periytynyt superclassista
    {
        private int tärkeys;
        
        public ImprovedToDo()    //default constructor
        {
            tehtävä="";
            paikka="";
            tärkeys= 0;
        }
        
        public ImprovedToDo(String tehtävä) // one parameter
        {
            this.tehtävä=tehtävä;
            paikka="";
            tärkeys= 0;
        }
        
        public ImprovedToDo(String tehtävä, String paikka, int tärkeys)
        {
            this.tehtävä=tehtävä;
            this.paikka=paikka;
            this.tärkeys=tärkeys;
        }
            
        public void setTärkeysArvo(int n)
        {
            tärkeys=n;
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
//                System.out.println("Syötä numero 1, 2 tai 3");
//            }
        }        
        @Override
        public void printData()
        {
        super.printData(); // Hakee printdata metodin ToDo Classista
            System.out.println("Tärkeys: " + tärkeys);
        }
    }