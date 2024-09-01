class demo6
{
    //create a method with if else

    static void CheckAge(int age) //creating method
    {
        if(age<20) //ifelse statements
        {
            System.out.println("Access denied, you are not old enough");
        }
        else{
            System.out.println("Access granted,");
        }
        
    }
    public static void main(String[] args)
    {
        CheckAge(51); //call the checkage method
    }
}