package Array;

public class SecondLargest {
    public static void main(String[] args){
        int [] array = { 12,43,6,43,90,23,57};
        int largest = 0;
        int secondLargest = -1;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>secondLargest && array[i]!=largest){
                secondLargest = array[i];
            }
        }
        System.out.println("Second Largest number : "+secondLargest);
    }
}
