/*n the editor.
 */
 //* To change this license header, choose License Headers in Project Properties.
 //* To change this template file, choose Tools | Templates
 //* and open the template i
package aldaya_quize1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vea
 */
public class ALDAYA_Quize1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
      
        
        System.out.println("ALDAYA_Quize1");
        System.out.println("Select number");
        System.out.println("No#1------1");
        System.out.println("No#2------2 wala sir di makaya");
        System.out.println("No#3------3");
        
            int select = scanner.nextInt();
       if(select==1){
            printfirst();
            more();
      
       }if (select==3){
           printthird();
           
       }
       
    }
       
    
    
    
    
        public static void printfirst(){
        int []array = {82,44,96,7,13,56,74,14,98,36};
        
        System.out.println("The arrays are:" + Arrays.toString(array));
        
        }
        
     
      
      public static void printthird(){
         Scanner scanner = new Scanner (System.in);
        System.out.println("Enter element of array:");
        int size = scanner.nextInt();
        int[]array = new int[size];
        
        System.out.println("Enter the numbers:");
        for (int i=0; i<size;i++){
            array[i]=scanner.nextInt();
            
        }
        System.out.println("Original Array");
        printArray(array);
        
        insertionSort(array);
        
        System.out.println("Sorted Array:");
        printArray(array);
        
        scanner.close();  
        
    }
    public static void insertionSort(int arr[]){
        int n=arr.length;
      for(int i=0; i<n-1; i++){
          int minIndex = i;
          for(int j=i+1; j<n; j++){
              if(arr[j] <arr[minIndex]){
                  minIndex=j;
              }
          }
          int m= arr[i];
      arr[i]=arr[minIndex];
      arr[minIndex]=m;
          
      }
    }
    
    public static void printArray(int arr[]){
        for(int num: arr){
            System.out.println(num+ " ");
            
   
        } 
        
    }

    
    
    
    
    
    
        
    public static void more(){
         Scanner scanner = new Scanner (System.in);
        System.out.println("choose a number");
        int select = scanner.nextInt();
       if(select==1){
            printfirst();
            
       }if(select==2){
           System.out.println("WALA OII..DILI MAKA SIR ATAYY!!");
       }else if(select==3){
           printthird();
       }
    }
   
        
        
        
        
}
    


