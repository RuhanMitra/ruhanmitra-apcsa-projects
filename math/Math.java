package math;

class Math {

    public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!
    System.out.print("Hello World");
    System.out.println("Hello world!");









    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer):
    //integer is a whole number. For example, -1, 1, 12 etc
    
    //double:
    //double happens when there is a variable which needs a decimal point such as 3.141592653
  
    //boolean:
    //boolean is when there are only two options, which are true or false
    

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES
    int a=24;
    System.out.println(a);
    double b=2.2342;
    System.out.println(b);
    boolean aboveOrUnder0= true;
    System.out.println(aboveOrUnder0);




    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %
    int wewcec = 10-2;
    int xqed = 10+1;
    int qw = 12000*2;
    int rwfcef = 12/3;
    int wdjkce = 1345%46;
    System.out.println(wdjkce);
    //Try doing some math operations with numbers. How can we check to see if the math worked?
    // We can see the result of the math by printing the variables we created+

    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both
    for(int i=1; i<=100; i=i+2){
      System.out.println(i);
    }



    //All multiples of 3 from 1 to 100
    for(int x=1 ; x<=100; x++){
      if (x%3==0){
        System.out.println(x);
     }
    }




    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
    for(int w=1000; w>=0; w=w-1){
      if (w%10 == 0){
        System.out.print(w + "-");
      }
    }

    for(int i = 0; i<= 20 ; i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
  }
}
