package RefactoringCleanCode;

public class ArrayOperation {
    
    private int[] sortedArray;
    private int lengthToLoop;
    
    public int[] sortArrayWithBubbleSort(int[] arrayToSort){       
        cloneArrayAndSetLengthToLoop(arrayToSort);
        
        for (int i = 0; i < lengthToLoop; i++) {
            for (int j = 0; j < lengthToLoop - i; j++) {
                if (isCurrentElementValueBiggerThenNext(j, j+1)) {
                    changeElementsPosition(j, j+1);
                }
            }

            if (!hasElementsToSort()){
                break;
            }            
        }
        return sortedArray;
    }

    private void cloneArrayAndSetLengthToLoop(int[] arrayToSort){
        sortedArray = arrayToSort.clone();        
        lengthToLoop = sortedArray.length - 1;         
    }
    
    private boolean isCurrentElementValueBiggerThenNext(int currentIndex, int nextIndex) {
        return sortedArray[currentIndex] > sortedArray[nextIndex];
    }
    
    private void changeElementsPosition(int currentIndex, int nextIndex) {
        int previousItem = sortedArray[currentIndex];
        sortedArray[currentIndex] = sortedArray[nextIndex];
        sortedArray[nextIndex] = previousItem;
    }
    
    private boolean hasElementsToSort(){
        for (int i = 0; i < lengthToLoop; i++){
            if (isCurrentElementValueBiggerThenNext(i, i+1)){
                return true;            
            }
        }
        return false;
    }
}
