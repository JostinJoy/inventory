import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class de {
    
    static int ans=0;
    static String InventoryName="";
    static String InventoryTotal="";
  static String NewNum="";
    static List<String> list = new ArrayList<String>();
    static Scanner input = new Scanner( System.in );
    
    
   
    
    public static  void AddInv()
    {
    	System.out.println("Add A Inventory Item name and total number......");
        
    	InventoryName=input.next().toString();
    	InventoryTotal=input.next().toString();
        list.add(InventoryName);
       list.add(InventoryTotal);
       
     
    }
    
    
    public static void show()
    {
        for(int i=0;i<list.size();i++) {
         
        	InventoryName=list.get(0);
        	InventoryTotal=list.get(1);
               
                   
        }
        System.out.println("Name=   "+InventoryName+"   Total inventory item stock = "+InventoryTotal+" ");
        
    }
    public static void buy()

    		{
    			for(int i=0;i<list.size();i++) {
             
    				InventoryName=list.get(0);
    				InventoryTotal=list.get(1);
               
           
    		 }
    			list.remove(InventoryName);
    			list.remove(InventoryTotal);
    
    			System.out.println("\n HOW MENY ITEM DO YOU WANT TO BUY FOR INCRESSING STOCK??");
    			NewNum=input.next().toString();
    			ans=Integer.parseInt(InventoryTotal)+Integer.parseInt(NewNum);
    			InventoryTotal=Integer.toString(ans);
    			list.add(InventoryName);
    			list.add(InventoryTotal);
        
    			}
    
    
    public static void sell()
    	{
    		for(int i=0;i<list.size();i++) {
	        
    			InventoryName=list.get(0);
    			InventoryTotal=list.get(1);
        
    
    	}
			 list.remove(InventoryName);
			 list.remove(InventoryTotal);
			
			 System.out.println("\n HOW MENY ITEM DO YOU WANT TO SELL??");
			 NewNum=input.next().toString();
			 ans=Integer.parseInt(InventoryTotal)-Integer.parseInt(NewNum);
			 InventoryTotal=Integer.toString(ans);
			 
			 list.add(InventoryName);
			 list.add(InventoryTotal);
    	}
    
    public static void main(String[] args) {
        
        System.out.println("Inventory System");
        System.out.println("----------------\n");
            
        char selection;
           Scanner input = new Scanner( System.in );
           do
               {
        	   
                   System.out.println("1. ADD ITEM \t 2. SHOW \t 3. BUY ITEM \t 4. SELL");
                   selection = input.next().charAt(0);

                   switch(selection){
                   case '1':
                	   AddInv();
                       break;
                   case '2':
                       show();
                       break;
                   case '3':
                       buy();
                       break;
                 
                   case '4':
                       sell();
                       break;
                   default:
                      System.out.println("Please select 1. ADD ITEM \\t 2. SHOW \\t 3. BUY ITEM \\t 4. SELL");
               }//end Switch   

        }while( selection != 4);//end do

        }//end main

   

}