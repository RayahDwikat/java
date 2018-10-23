
package mergeandbubblesortexample;

public class MergeAndBubbleSortExample {

    public static void main(String[] args) {
        int array1[] = {2,4,1,-2,6,9,0,3,7, 12, 56, 11, -3, -2, 100};
        int array2[] = {2,4,1,-2,6,9,0,3,7, 12, 56, 11, -3, -2, 100};
		mergeSort(array1);
                System.out.print("Merge Sort:");
		for(int i=0;i<array1.length;i++)
			System.out.print(array1[i] + " ");
                System.out.println();
                System.out.print("Bubble Sort");
                System.out.println();
               bubbleSort(array2);
               for(int i=0;i<array2.length;i++)
			System.out.print(array2[i] + " ");
               
    }
    public static void mergeSort(int array[]){
                System.out.println ("*");
		if(array.length>1){
			int mid = array.length / 2;
			int[] firstHalf = new int[mid];
			System.arraycopy(array, 0, firstHalf, 0, mid);
			mergeSort(firstHalf);
			int secondHalfLength = array.length - mid;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(array, array.length / 2,secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			merge(firstHalf, secondHalf, array);
		}
	}
    public static void merge(int [] left, int[] right, int [] temp){
		int leftCounter = 0;
		int rightCounter =0;
		int arrayCounter = 0;
		while (leftCounter < left.length && rightCounter < right.length) {
			if(left[leftCounter] < right[rightCounter]) 
				temp[arrayCounter++] = left[leftCounter++];
				else temp[arrayCounter++] = right[rightCounter++];
		}
			while(leftCounter<left.length) temp[arrayCounter++] = left[leftCounter++];
			while(rightCounter<right.length) temp[arrayCounter++] = right[rightCounter++];
	}

    public static void bubbleSort(int a[]){
    
        for(int i=0;i<a.length;i++)
            for(int j=i+1; j<a.length; j++){
                System.out.print(" * ");
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
    }
}

