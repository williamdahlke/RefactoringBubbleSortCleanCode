package RefactoringCleanCode;

// Implementação otimizada em Java do Bubble sort
// Código extraído de https://www.geeksforgeeks.org/bubble-sort/
// This code is contributed by Nikita Tiwari.

public class BubbleSort{

    public static void main(String args[]){
        int[] arrayToSort = { 64, 34, 25, 12, 22, 11, 90 };
        int[] sortedArray = sortArrayWithBubbleSort(arrayToSort);
        printArray(sortedArray);
    }              
        
    public static int[] sortArrayWithBubbleSort(int[] arrayToSort){
        return new ArrayOperation().sortArrayWithBubbleSort(arrayToSort);
    }
    
    private static void printArray(int arrayToPrint[]){
        System.out.println("Array ordenado: ");
        for (int element : arrayToPrint) System.out.print(element + " ");
        System.out.println();
    }
}
