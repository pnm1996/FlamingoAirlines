import java.io.*;
class Lufthansa
{  
    String depa,arri;
    double fare;
    int qty;
     InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String name[]=new String[100];
        String gender[]=new String[100];
   
        void delay()
        {
            for(int i=0;i<9999999;i++)
            {
            }
        }
    Lufthansa()
    {
        depa=arri="";
        fare=0;
        qty=0;
    }
    
    void setFlightInfo(String a,String b,double c,int d)
    {
        depa=a;
        arri=b;
        fare=c;
        qty=d;
    }
    
    void LufthansaMenu() throws IOException
    {        
        System.out.println("\f");
       
        
        int ch=0,ch1=0,i;
           String departure[]={"Lisbon","Hong Kong","Rio de Janeiro"};
    String arrival[]={"Berlin","Zurich","Singapore City"};
        double rate[][]={
                            {10000,15000,25000},
                            {20000,30000,15000},
                            {25000,20000,35000}              
                        };
        
        System.out.println("*** LUFTHANSA AIRLINES  ***");
           delay();
        System.out.println("    =======    =======    \n");
           delay();

        do
        {
            System.out.println("Departure City");
            for(i=0; i<3; i++)
            {
                System.out.println((i+1)+". "+departure[i]);
            }
            System.out.println("\n");            
            System.out.print("Enter your Choice : ");
            try
            {
                ch=Integer.parseInt(br.readLine());
            }catch(NumberFormatException nfe)
            {
                ch=0;
                System.out.println("PLEASE ENTER NUMBER ONLY");
            }
            
            if(ch>=1 && ch<=3)
            {
                depa=departure[ch-1];
                break;
            }    
        }while (true);

        do
        {
               delay();
               System.out.println("Arrival City");
            for(i=0; i<3; i++)
            {
                System.out.println((i+1)+". "+arrival[i]);
            }
            System.out.println("\n");  
               delay();
            System.out.print("Enter your Choice : ");
            try
            {
                ch1=Integer.parseInt(br.readLine());
            }catch(NumberFormatException nfe)
            {
                ch1=0;
                System.out.println("PLEASE ENTER NUMBER ONLY");
            }
            
            if(ch1>=1 && ch1<=3)
            {
                arri=arrival[ch1-1];
                break;
            }    
        }while (true);

        fare=rate[ch-1][ch1-1];
        
        do
        {
            try
            {
                System.out.println("\t\tEnter Number of tickets you want to buy ");
                qty=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("PLEASE ENTER NUMBER ONLY");
                qty=0;
            }
        }while(qty<=0);
delay();
        for(i=0;i<qty;i++)
        details(i);
        delay();
        System.out.println("------------------------------------------------------------------------------------");
        delay();
        System.out.println("                                   TICKET                                           ");
        delay();
        System.out.println("                                  LUFTHANSA                                       ");
        delay();
        System.out.println("\n\nDEPARTURE CITY   \t  ARRIVAL CITY ");
        delay();
        System.out.println("      "+depa+" \t  \t   "+arri);
            
        for(i=0;i<qty;i++)
        {
            System.out.println("Passengar Name: "+name[i]+"               "+gender[i]+"       "+fare);
        }
        System.out.println("\n\n                                                      TOTAL FARE  :   "+(fare*qty));
        delay();
        System.out.println("------------------------------------------------------------------------------------");
    }
  void details(int i)
    {
        try{
           System.out.println("Passanger Name ");
           name[i]=br.readLine();
           System.out.println("Passanger Gender");
           System.out.println("1. Male");
           System.out.println("2. Female");
           System.out.print("Enter your choice : ");
           int s=Integer.parseInt(br.readLine());
           if(s==1)
            gender[i]="Male";
           else if(s==2)
            gender[i]="Female";
            else
            {
                System.out.println("Pls. enter correct no.");
                details(i);
            }
        }
        catch(Exception e)
        {
            System.out.println("Pls. enter correct data");
            details(i);
       
        }
        
    }
}


