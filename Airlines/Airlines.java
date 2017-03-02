import java.io.*;

class Airlines
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);


 int i;       KingFisher k=new KingFisher();
        Jet j=new Jet(); 
        Lufthansa l=new Lufthansa();
        Emirates e=new Emirates();
       
        void delay()
        {
            for(i=0;i<9999999;i++)
            {
            }
        }
            public void main1() throws IOException
        {    
        
            int ch;
           
          
                
            do
            {
                 
                delay();
                 System.out.println("\t \t \t \t Welcome to Flamingo Airline Booking                   ");
                 delay();
                 System.out.println("_______________________________________________________________________________");
                delay();
                System.out.println("_______________________________________________________________________________");
                delay();
                 System.out.println("\t \t \t \t What Do You Prefer?             ");
                 delay();
                 System.out.println("\t \t \t \t 1.KingFisher               ");
                 delay();
                 System.out.println("\t \t \t \t 2.Jet                ");
                 delay();
                 System.out.println("\t \t \t \t 3.Lufthansa          ");
                  delay();
                  System.out.println("\t \t \t \t 4.Emirates            ");
                  delay();
                  System.out.println("\t \t \t \t 5.Exit                ");
                   delay();
                   System.out.println("______________________________________________________________________________");
                delay();
                   System.out.println("______________________________________________________________________________");
                   delay();
                System.out.print("Enter your choice : ");
                try
                {
                    ch=Integer.parseInt(br.readLine());
                }
                catch(NumberFormatException nfe)
                {
                    ch=0;
                }
                switch(ch)
                {
                    case 1:
                        k.kingFisherMenu();
                        break;
                    case 2:
                        j.JetMenu();
                        break;
                    case 3:
                        l.LufthansaMenu();
                        break;
                    case 4:
                        e.EmiratesMenu();
                        break;
                    case 5:System.out.println("\f");
                    delay();
                    System.out.println("\t \t Thank You For Choosing Flamingo Airline Booking"); 
                    delay();
                    System.out.println("    \t \t \t Do Visit Again \t \t ");
                    delay();
                    System.out.println(" \n \n \n \n \n \t \t \t \t  \t \t \t \tProject By: \n \t \t \t \t \t \t \t \t \t Purav Mehta \n  \t \t \t \t \t \t \t \t \t 10132 \n  \t \t \t \t \t \t \t \t \t X-A ");
                    System.exit(0);    

                        break;
                        default:
                        System.out.println("Please Enter Your Choice From 1-5");
                    }
                }while(ch!=5);
            }
    
    public static void main() throws IOException
    {    
        Airlines al=new Airlines();
        al.main1();
    }
}
