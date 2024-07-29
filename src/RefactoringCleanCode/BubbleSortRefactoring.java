package RefactoringCleanCode;

// Implementação otimizada em Java do Bubble sort
// Código extraído de https://www.geeksforgeeks.org/bubble-sort/

//O método orderArrayWithBubbleSort precisa de ajustes, pois ele tem muitas responsabilidades
//não gostei da variável boolean trocado;
//Analisar se não é possível criar uma nova classe as características de um elemento que está sendo ordenado
//Relembrar o funcionamento do BubbleSort


public class BubbleSortRefactoring {

    public static int[] orderArrayWithBubbleSort(int[] arrayToOrder)
    {
        int arraySize = arrayToOrder.length;        
        int[] arrayOrdered = arrayToOrder.clone();
        
        int i, j, previousItem;
        boolean trocado;
        for (i = 0; i < arraySize - 1; i++) {
            trocado = false;
            for (j = 0; j < arraySize - i - 1; j++) {
                if (arrayOrdered[j] > arrayOrdered[j + 1]) {
                    previousItem = arrayOrdered[j];
                    arrayOrdered[j] = arrayOrdered[j + 1];
                    arrayOrdered[j + 1] = previousItem;
                    trocado = true;
                }
            }

            if (trocado == false)
                break;
        }
        return arrayOrdered;
    }

    private static void printArray(int arr[])
    {
        System.out.println("Array ordenado: ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
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

