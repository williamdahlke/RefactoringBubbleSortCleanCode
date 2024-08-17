package RefactoringCleanCode;

public class ArrayOperation {
    
    private int[] sortedArray;
    private int lengthToLoop;
    private int numberSortedElements = 0;
    
    public int[] sortArrayWithBubbleSort(int[] arrayToSort){       
        setCloneArray(arrayToSort);
        setLengthToLoop(arrayToSort);
                
        while (hasElementsToSort()){
            resetNumberSortedElements();
            sortElementsBubbleSort();  
        }
        return sortedArray;
    }

    private void setCloneArray(int[] arrayToSort){
        sortedArray = arrayToSort.clone();                        
    }
    
    private void setLengthToLoop(int[] arrayToSort){
        lengthToLoop = arrayToSort.length - 1; 
    }

    private boolean hasElementsToSort(){
        for (int i = 0; i < lengthToLoop; i++){
            if (isCurrentElementValueBiggerThenNext(i, i+1)){
                return true;            
            }
        }
        return false;
    }

    private void resetNumberSortedElements(){
        numberSortedElements = 0;
    }
    
    private boolean isCurrentElementValueBiggerThenNext(int currentIndex, int nextIndex) {
        return sortedArray[currentIndex] > sortedArray[nextIndex];
    }

    private void sortElementsBubbleSort() {
        for (int j = 0; j < lengthToLoop - getNumberSortedElements(); j++) {
            if (isCurrentElementValueBiggerThenNext(j, j+1)) {
                changeElementsPosition(j, j+1);
            }
        }
    }

    private int getNumberSortedElements(){
        return numberSortedElements;
    }
    
    private void changeElementsPosition(int currentIndex, int nextIndex) {
        int previousItem = sortedArray[currentIndex];
        sortedArray[currentIndex] = sortedArray[nextIndex];
        sortedArray[nextIndex] = previousItem;
        incrementNumberSortedElements();
    }

    private void incrementNumberSortedElements(){
        numberSortedElements++;
    }
}
