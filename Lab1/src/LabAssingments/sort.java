package LabAssingments;

public class sort {
    
    static void sort(int[] arr){
        int i = arr[0];
        int j = arr[arr.length-1];

        for (int j2 = 0; j2 < arr.length; j2++) {
        if ( i > j ) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {2, -1, 5, 0,3};

        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
