package RefactoringCleanCode;

public class ArrayOperation {
    
    private int[] sortedArray;
    private int numberElementsToOrder;
    
    public int[] sortArrayWithBubbleSort(int[] arrayToSort){       
        setCloneArray(arrayToSort);
        setElementsToOrder(arrayToSort);
                
        while (hasElementsToSort()){            
            sortElementsBubbleSort(); 
            updateElementsToOrder(); 
        }
        return sortedArray;
    }

    private void setCloneArray(int[] arrayToSort){
        sortedArray = arrayToSort.clone();                        
    }
    
    private void setElementsToOrder(int[] arrayToSort){
        numberElementsToOrder = arrayToSort.length - 1; 
    }

    private boolean hasElementsToSort(){
        for (int i = 0; i < numberElementsToOrder; i++){
            if (isCurrentElementValueBiggerThenNext(i, i+1)){
                return true;            
            }
        }
        return false;
    }

    private void sortElementsBubbleSort() {
        for (int j = 0; j < numberElementsToOrder; j++) {
            if (isCurrentElementValueBiggerThenNext(j, j+1)) {
                changeElementsPosition(j, j+1);
            }
        }
    }    

    private boolean isCurrentElementValueBiggerThenNext(int currentIndex, int nextIndex) {
        return sortedArray[currentIndex] > sortedArray[nextIndex];
    }

    private void changeElementsPosition(int currentIndex, int nextIndex) {
        int previousItem = sortedArray[currentIndex];
        sortedArray[currentIndex] = sortedArray[nextIndex];
        sortedArray[nextIndex] = previousItem;
    }

    private void updateElementsToOrder(){
        numberElementsToOrder--;
    }
}
