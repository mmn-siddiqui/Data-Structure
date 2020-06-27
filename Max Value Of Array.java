
package lab_2_q2;
public class Lab_2_Q2 {
    public static void main(String[] args) {
    int arr[] = {10,25,3,78,89};
    
    check_max(arr);
    }

    public static void check_max(int[] arr) {
     int value = 0; 
    for(int i = 0 ; i<arr.length ; i++)
    {
        if(value<arr[i])
        {
            value = arr[i];
        }
        
    }
    System.out.println("Max value is : "+value);
    }
    
}
