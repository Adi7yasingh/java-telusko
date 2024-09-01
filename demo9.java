class computer
{
    public void PlayMusic()
    {
        System.out.println("Music Playing");
    }
    public String GetMeAPen(int cost)
    {
       if(cost >=10) 
            return "pen";  
       else 
            return "nothing";      
    }
}
class demo9
{
    
    public static void main(String[] args)
    {
        computer obj= new computer(); //creating object
        obj.PlayMusic();
        String str=obj.GetMeAPen(11); //we have to store wht we are getting in return
        System.out.println(str); // then print the return value which is stored in str
    }

}  