import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class SalesOrderApp {

    
    public static void main(String[] args) throws FileNotFoundException {
      ArrayList<SalesOrder> orderList = new ArrayList<SalesOrder>();
      generateSaleOrder(orderList);
      for (int nIndex = 0; nIndex < orderList.size(); nIndex++) {
     
      printSalesOrderInfo(orderList.get(nIndex));
      }//end for loop
       
    }//end main method
    
    public static void printSalesOrderInfo(SalesOrder salesOrder){
       
    
        System.out.println("Order date: " + salesOrder.getOrderDate());
        System.out.println("Region: " + salesOrder.getRegion());
        System.out.println("Phone: " + salesOrder.getPhone());
        int nLength = salesOrder.getItemName().length();
        System.out.println("Item name: " + salesOrder.getItemName().substring(0, nLength-1) + salesOrder.getItemName().substring(nLength-1).toLowerCase());
        System.out.println("Unit: " + salesOrder.getUnit());
        System.out.println("Unit cost: $" + salesOrder.getUnitCost());
        System.out.println("Total cost: $" + salesOrder.totalCost());
    }//end print sales order method
    
    
    public static void generateSaleOrder(ArrayList<SalesOrder> list) throws FileNotFoundException {
         String sFileName = "SalesOrders.txt";
       String sInputLine = "";
       File fileToOpen = new File(sFileName);
       Scanner inputFile = new Scanner(fileToOpen); 
       String[] saTokens = null;
       
       while(inputFile.hasNext()){
           sInputLine = inputFile.nextLine();
           saTokens = sInputLine.split("#");
           SalesOrder sales = new SalesOrder();
           sales.setOrderDate(saTokens[0]);
           sales.setRegion(saTokens[1].trim());
           sales.setRepresentative(saTokens[2]);
           sales.setPhone(saTokens[3]);
           sales.setItemName(saTokens[4]);
           sales.setUnit(Integer.parseInt(saTokens[5]));
           sales.setUnitCost(Double.parseDouble(saTokens[6]));
           list.add(sales);
         
       }//end while loop
       inputFile.close();
       
    }//end method generatesaleorder
    
    
}//end class SalesOrderApp
