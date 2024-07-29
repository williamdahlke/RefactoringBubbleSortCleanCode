package WithoutRefactoring;

// Código extraído de https://www.geeksforgeeks.org/bubble-sort/

//O método bubbleSort precisa de ajustes, pois ele tem muitas responsabilidades
//não gostei da variável boolean trocado e nem a variável temp;
//remover comentários que não são necessários
//Analisar se não é possível criar uma nova classe as características de um elemento que está sendo ordenado
//reavaliar os nomes das variáveis
//Relembrar o funcionamento do BubbleSort
//Arrumar a declaração do int i no método printArray
//Criar testes unitários antes de refatorar um método para validar se as mudanças não vão mudar o funcionamento do método
//O nome dos parâmetros não está legal nos métodos bubbleSort

class BubbleSort {

    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean trocado;
        for (i = 0; i < n - 1; i++) {
            trocado = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocado = true;
                }
            }

            // If no two elements were
            // trocado by inner loop, then break
            if (trocado == false)
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Array ordenado: ");
        printArray(arr, n);
    }   
}

// This code is contributed
// by Nikita Tiwari.
