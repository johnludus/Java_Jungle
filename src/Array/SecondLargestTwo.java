package Array;

public class SecondLargestTwo {
    public static void main(String[] args){
        int []array = {12,43,65,3,3,2,54};
        int largest = -1;
        int secondLargest = -1;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                secondLargest = largest;
                largest = array[i];

            }
            else if(array[i]>secondLargest && array[i]<largest){
                secondLargest = array[i];
            }
        }
        System.out.println(secondLargest);
    }
}
