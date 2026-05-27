package Array;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class ThirdLargest {
    public static void main(String[] args){
        int []array = { 12,3,23,-5,33,56,44,76 };
        int largest = MIN_VALUE;
        int secondLargest = MIN_VALUE;
        int thirdLargest = MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i] > largest){
                thirdLargest = secondLargest;   // Think why we are assigning in reverse order.
                secondLargest = largest;
                largest = array[i];

            }
            else if(array[i] > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = array[i];
            }
            else if( array[i] > thirdLargest){     // Is this else if is necessary.
                thirdLargest = array[i];
            }
        }
        System.out.println("Third largest number : "+thirdLargest);
    }
}
