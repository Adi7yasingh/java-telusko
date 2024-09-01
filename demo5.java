//method
//wht is method
/*A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.*/

 public class demo5
{
 static void MyMethod(String fname, String lname, int age)
 //creating a method
 {
   System.out.println(fname + lname + age + " MCA ");
 }

public static void main(String[] args)
{
    //call a method
    MyMethod("aditya ","singh ", 24);
    MyMethod("robin ","bhatt ", 24);
    MyMethod("arjun ","arora ", 27);
    MyMethod("apaar ","shukla ", 23);
    
}
}