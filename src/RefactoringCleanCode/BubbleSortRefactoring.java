package RefactoringCleanCode;

// Implementação otimizada em Java do Bubble sort
// Código extraído de https://www.geeksforgeeks.org/bubble-sort/

//O método orderArrayWithBubbleSort precisa de ajustes, pois ele tem muitas responsabilidades
//não gostei da variável boolean trocado e nem a variável temp;
//remover comentários que não são necessários -- ok
//Analisar se não é possível criar uma nova classe as características de um elemento que está sendo ordenado
//reavaliar os nomes das variáveis 
//Relembrar o funcionamento do BubbleSort
//Arrumar a declaração do int i no método printArray -- ok
//Criar testes unitários antes de refatorar um método para validar se as mudanças não vão mudar o funcionamento do método
//O nome dos parâmetros não está legal nos métodos orderArrayWithBubbleSort -- ok

class BubbleSort {

    static void orderArrayWithBubbleSort(int[] arrayToOrder)
    {
        int arraySize = arrayToOrder.length;
        
        int i, j, temp;
        boolean trocado;
        for (i = 0; i < arraySize - 1; i++) {
            trocado = false;
            for (j = 0; j < arraySize - i - 1; j++) {
                if (arrayToOrder[j] > arrayToOrder[j + 1]) {

                    temp = arrayToOrder[j];
                    arrayToOrder[j] = arrayToOrder[j + 1];
                    arrayToOrder[j + 1] = temp;
                    trocado = true;
                }
            }

            if (trocado == false)
                break;
        }
    }

    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int[] arrayToOrder = { 64, 34, 25, 12, 22, 11, 90 };
        orderArrayWithBubbleSort(arrayToOrder);
        System.out.println("Array ordenado: ");
        printArray(arrayToOrder);
    }
}

// This code is contributed
// by Nikita Tiwari.

