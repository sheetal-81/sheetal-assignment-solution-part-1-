public class prime
{
    public static void main(String[] args) {
        
        for(int i=2;i<=20;i++)
        {
            int j;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(j>i/2)
            {
                System.out.print(i +" ");
            }

        }
    }
}