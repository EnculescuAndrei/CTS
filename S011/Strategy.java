import java.lang.reflect.Array;
import java.util.Arrays;

interface SortingStrategy{
    void sort(int[] array);
}
class BubbleSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for(int i =0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Array sorted using Bubble Sort strategy.");
    }
}
class QuickSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
        System.out.println("Array sorted using Quick SOrt strategy.");
    }
    private void quickSort(int[] array,int low, int high){
        if(low<high){
            int pivot = partition(array,low,high);
            quickSort(array,low,pivot-1);
            quickSort(array,pivot+1,high);
        }
    }
    private int partition(int[] array,int low,int high){
        int pivot = array[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(array[j]<=pivot){
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        int temp=array[i+1];
        array[i+1]=array[high];
        array[high]=temp;
        return i+1;
    }
}
class SortManager{
    private SortingStrategy sortingStrategy;
    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy=sortingStrategy;
    }
    public void sortArray(int[] array){
        sortingStrategy.sort(array);
    }
}

public class Strategy {
    public static void main(String[] args){
        SortManager sortManager = new SortManager();
        int[] array1={5,2,9,1,3};
        sortManager.setSortingStrategy(new BubbleSortStrategy());
        sortManager.sortArray(array1);
        System.out.println("Sorted array: "+ Arrays.toString(array1));

        int[] array2={7,4,8,2,1};
        sortManager.setSortingStrategy(new QuickSortStrategy());
        sortManager.sortArray(array2);
        System.out.println("Sorted array: "+ Arrays.toString(array2));
    }
}
