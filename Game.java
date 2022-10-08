//PROGRAM FOR BINARY SEARCH IN JAVA
//First The array should be in asecnding order

import java.util.Scanner;


public class Game{
    public static void main(String[] args){
    inp a1 = new inp();
    int[] list = a1.getdata();
    sort a2 = new sort(list);
    search a3 = new search(list);
}
}

class inp{
    Scanner ip = new Scanner(System.in);
     int n;
     int[] ar = new int[n];
    public inp(){
       System.out.println("Enter the number of elements to be added in the array:");
      n = ip.nextInt();
        ent();
   }
    private void ent()
    {
        System.out.println("Enter " + n + " number of the array:");
        int[] arr = new int[n];
        for(int j = 0 ; j < n ; j ++)
        {
            System.out.println("Enter the " +  j + " number of the array:");
            arr[j] = ip.nextInt();
        }
        ar = arr;
         display();
    }
    public void display(){
        System.out.println("The array can be shown as:");
        for(int j : ar)
        {
            System.out.print("  " + j);
        }
        
    }
    public int[] getdata()
    {
        return ar;
    }
   
}

class sort
{
    int p = 0;
    public sort(int[] arr)
    {
        //Selection Sort to be applied
        for(int i = 0 ; i < arr.length; i ++)
        {
            min(arr , i);
            System.out.println();
            
        }
        display(arr);
    }

    private void min(int[] arr , int i)
{
    int m = arr[i];
    for(int j = i + 1 ; j < arr.length ; j++ )
    {
        if(arr[j] < m)
        {
            m = arr[j];
            p = j;
        }
    }
    if(m == arr[i]){
        
        return;
    }
    else{
        
        int temp =  arr[p];
        arr[p] = arr[i];
        arr[i] = temp;     
    }
}

    public void display(int[] arr)
    {
        System.out.println("This is how the sorted array look like:");
        {
            for(int z : arr)
            {
                System.out.print(z + " ");
            }
        }
    }
    public int[] getdata()
    {
        return arr;
    }
}

class search
{
    int mid = 0;
    Scanner ip = new Scanner(System.in);
     public search(int[] arr)
    {
        System.out.println("Enter the number to be searched:\t");
        int s = ip.nextInt();
        int lt = 0 , rt = arr.length - 1;
        int z = binsr(arr , s , lt , rt);
        display(z);
    }
    
    private int binsr(int[] arr , int s , int lt , int rt){
        
        
        if(lt > rt){
            return -1;
        }
        else{
             mid = (lt + rt) / 2;
             System.out.println(" " + lt + "  " + mid + " " + rt);    
            if(arr[mid] == s){
                return mid;
            }
            else if(arr[mid] > s){
                return binsr(arr , s , lt , mid -1);
            }
            else{
                return binsr(arr , s , mid + 1 , rt);
            }
        }
        
    }
    public void display(int z)
    {
        if(z == -1){
            System.out.println("The number is not present in the list");
        }
        else{
            System.out.println("The element is present at the location:\t" + z);
        }
        
    }


}