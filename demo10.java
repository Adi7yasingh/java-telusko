//array
class demo10
{
    public static void main(String[] args)
    {
       // int num1[] = {5,6,7};
       int num1[] = new int[5];
       num1[0] = 4;
       num1[1] = 5;
       num1[2] = 6;
       num1[3] = 7;
       num1[4] = 8;
       //modified this   

       for(int i=0;i<=4;i++)
       {
            System.out.println(num1[i]);
       }
    }
}