package RefactoringCleanCode;

// Implementação otimizada em Java do Bubble sort
// Código extraído de https://www.geeksforgeeks.org/bubble-sort/

public class BubbleSortRefactoring {

    public static int[] orderArrayWithBubbleSort(int[] arrayToOrder)
    {
        int arraySize = arrayToOrder.length;        
        int[] arrayOrdered = arrayToOrder.clone();        
       
        for (int i = 0; i < arraySize - 1; i++) {
            boolean isItemPositionChanged;
            isItemPositionChanged = false;
            for (int j = 0; j < arraySize - i - 1; j++) {
                if (arrayOrdered[j] > arrayOrdered[j + 1]) {
                    int previousItem = arrayOrdered[j];
                    arrayOrdered[j] = arrayOrdered[j + 1];
                    arrayOrdered[j + 1] = previousItem;
                    isItemPositionChanged = true;
                }
            }

            if (isItemPositionChanged == false) break;
        }
        return arrayOrdered;
    }

    private static void printArray(int arrayToPrint[])
    {
        System.out.println("Array ordenado: ");
        for (int i = 0; i < arrayToPrint.length; i++) System.out.print(arrayToPrint[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int[] arrayToOrder = { 64, 34, 25, 12, 22, 11, 90 };
        orderArrayWithBubbleSort(arrayToOrder);
        printArray(arrayToOrder);
    }          
}

// This code is contributed
// by Nikita Tiwari.

