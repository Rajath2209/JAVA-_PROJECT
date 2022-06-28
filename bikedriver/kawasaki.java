
package bikedriver;


import information.riderinfo;

import java.util.Scanner;

class Driver{
    String name;
    int YOB;
    String mobile;

      Driver() {
        this.name ="Bike Owner";
        this.YOB = 2002;
        this.mobile = "998348324";
    }

                                                                                //  CONSTRUCTOTR RECIEVING OBJECT
      Driver (Driver jk)
      {
    
       this.name=jk.name;
       this.YOB=jk.YOB;
       this.mobile=jk.mobile;
      }
      
      Driver returnobj()
      {
          Driver obj=new Driver();
           System.out.println("Here we are passing object of class Driver: "+obj);
        return obj;
      
      }
      
    public void Drive(){
        System.out.println("Have nice drive");
    }
   

     Driver(String name,int YOB,String mobile){
        this.name=name;
        this.YOB=YOB;
        this.mobile=mobile;
    }
     
     
     void display()
     {
         System.out.println("The name of the rider is  "+this.name);
         System.out.println("The year of birth of rider is "+this.YOB);
         System.out.println("The mobile number of rider is "+this.mobile);
        
     }
    
    public String getName(){
        return name;
    }

    void profile(String peter) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

class bike extends Driver{
    String bike_no;
    String bikeChoice;

    bike(){
        this.bikeChoice="BMW";
        this.bike_no="KA-09-1998";
    }
     
     bike(String bikeChoice1,String bike_no1){
         this.bikeChoice=bikeChoice1;
         this.bike_no=bike_no1;
     }
     
      void display()
     {
         super.display();                                                       ///USE OF SUPER KEY
         System.out.println("The bike name is "+bikeChoice);
         System.out.println("The bike number is "+bike_no);
     }
      
     void EnjoyHotdrink() {
         System.out.println("Want hotdrink? "+ "Enter for Tea or cofFee(1 or 2)!");

         Scanner s = new Scanner(System.in);
            int Choice = s.nextInt();
            if(Choice==1){
                System.out.println("Enjoy the TEA in this cold weather !!!");
            }
            if(Choice==2){
                System.out.println("Enjoy the COFFEE in this cold weather !!!");
            }
            Hotdrink ok=new Hotdrink();
            ok.getHotdrink();
     } 
}
 class Hotdrink{
     
    private void addHotWater()
    {
       System.out.println("Adding hot water");
    }
    private void addMilk() {
        System.out.println("Adding hot milk");
    }

    private void addSugar() {
        System.out.println("Adding sugar");
    }
    public void getMixture() {
        System.out.println("Your Hotdrink is "+"getting ready...");
        
        addMilk();
        addSugar();
    }
    public void getHotdrink(){
        
        System.out.println("Have you enjoyed your drink:");
        
    }

    public void addIngredients(){

    }
} 

interface Clean {                                                               // Interface 
    void cleanPot();
    void cleaned(int v, int n);                                                 // Interface with variabless
    default void inter()
    {
           System.out.println("Default interface");
    }
}

class Tea extends Hotdrink {                                                    //Multiple Inheritence 
    @Override
     public void addIngredients() {
        System.out.println("Tea Bag added");
    } 

    @Override
     public void getHotdrink()
    {
        Coffee ok=new Coffee();
        ok.cleanPot();
        getMixture();
        addIngredients();

        System.out.println("Tea is Ready Enjoy");
    }

   
}

 class Coffee extends Tea implements Clean {                        //Multi level Inheritence coffee extends from Tea 
                                                                    // and Tea get extends from Hotdrink
   // @Override
    public void addingrediants () {
        System.out.println("Coffe Bag added");
    
    }
   // @Override
    public void getHotdrink(){
        cleanPot();
        getMixture();
       addingrediants();
        System.out.print("Coffe Ready!Enjoy..");

    }
   // @Override
    public void cleanPot(){
        System.out.println("Cleaning Coffee pot..");
    }

   // @Override
    public void cleaned(int v,int n){
        System.out.println("pot is cleaned");
    }

} 
class Box{  
    synchronized void printTable(int n){                                //synchronized method  
      for(int i=1;i<=5;i++){  
        System.out.println(n*i);  
        try{  
         Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);}  
      }  
     
    }  
   }  
     
   class MyThread1 extends Thread{                                   //thread creation using extending threads
   Box t;  
   MyThread1(Box t){  
   this.t=t;  
   }  
   public void run(){  
   t.printTable(5); 
    System.out.println("--------------------------------------------------------"); 
   }  
     
   }  
   class MyThread2 extends Thread{  
   Box t;  
   MyThread2(Box t){  
   this.t=t;  
   }  
   public void run(){  
   t.printTable(100);  
   }  
   }  
     
   // class representing custom exception  
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
    
// class representing custom exception  
class customexception  extends Exception  
{  
    public  customexception(String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

   
     
public class kawasaki {
    public static void main(String[] args) {
        System.out.println("have a nice drive sir".toLowerCase());              //string handling functions
        Scanner s= new
        Scanner(System.in);
        Driver peter = new Driver("rajath",2000,"9282627287");
      //  peter.profile("peter");
        bike b;
        System.out.println("Want to choose Bike?" + "press 0 for No / 1 for Yes".toUpperCase()); //string handling functions
        int bikeType = s.nextInt();
        if(bikeType ==1)
        {
            System.out.println("Enter Bike name ");
            String bikename = s.next();
             System.out.println("Enter Bike number :");
             String bino=s.next();
            bike kl =new bike( bikename, bino);
            kl.display();
        }
        else
        {
            b = new bike();
        }
          System.out.println("--------------------------------------------------------");
        
         
          System.out.println("Here we are showing the passaging of object:");
          System.out.println();
        Driver gh=new Driver("Naren",2009,"9873768673");
        Driver gh1=new Driver(gh);                                              // passing object
        bike op=new bike("HONDA","KA-09-2920");
        op.display();
        
        System.out.println("--------------------------------------------------------");
        
        gh.returnobj();                                                         // Returning objects from method
       
         System.out.println("--------------------------------------------------------");
        
       try{
           throw new customexception("This is the execution of custom exception");
       }
       catch(Exception e){
          //System.out.println("CustomException");
           System.out.println(e.getMessage());
       }
       
              System.out.println("--------------------------------------------------------");
        
        System.out.println("usage of import packages:");
        riderinfo io=new riderinfo();
        io.whereto();
        System.out.println("--------------------------------------------------------");
        
        System.out.println("\nExceution of thread synchorization");
                
        Box obj = new Box();                                                    //only one object  
        System.out.println("Thread 1 here");
        MyThread1 t1=new MyThread1(obj);  
 
        System.out.println("Thread 2 here");
        MyThread2 t2=new MyThread2(obj);  
        t1.start();  
        t2.start();
        
        System.out.println("--------------------------------------------------------");
        
        
     
    }
}