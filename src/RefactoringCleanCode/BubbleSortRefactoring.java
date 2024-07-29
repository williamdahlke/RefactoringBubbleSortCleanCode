package RefactoringCleanCode;

// Implementação otimizada em Java do Bubble sort
// Código extraído de https://www.geeksforgeeks.org/bubble-sort/
// This code is contributed
// by Nikita Tiwari.

public class BubbleSortRefactoring{

    public static int[] sortArrayWithBubbleSort(int[] arrayToSort){
        int arraySize = arrayToSort.length;        
        int[] sortedArray = arrayToSort.clone();        
       
        for (int i = 0; i < arraySize - 1; i++) {
            boolean isItemSwapped = false;
            for (int j = 0; j < arraySize - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int previousItem = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = previousItem;
                    isItemSwapped = true;
                }
            }

            if (!isItemSwapped){
                break;
            }            
        }
        return sortedArray;
    }

    private static void printArray(int arrayToPrint[]){
        System.out.println("Array ordenado: ");
        for (int element : arrayToPrint) System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int[] arrayToSort = { 64, 34, 25, 12, 22, 11, 90 };
        int[] sortedArray = sortArrayWithBubbleSort(arrayToSort);
        printArray(sortedArray);
    }          
}

