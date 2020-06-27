
package lab_2_q3;
public class Lab_2_Q3 {
    public static void main(String[] args) {
    
        int arr[] = {10,25,3,78,89};
    
    check_min(arr);
    
    }

    private static void check_min(int[] arr) {
        int value , value1 = 0 ;
        
        for(int i = 0 ; i<arr.length ; i++)
    {
        if(value1<arr[i])
        {
            value1 = arr[i];
        }
        
    }
        value = value1;
    for(int i = 0 ; i<arr.length ; i++)
    {
        if(value>arr[i])
        {
            value = arr[i];
        }
        
    }
    System.out.println("Min value is : "+value);
    }
    }
