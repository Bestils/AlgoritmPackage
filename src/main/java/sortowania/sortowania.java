package sortowania;

public class sortowania {
  public static void  swap (int[] array,int i, int j){
      if(i==j){
          return;
      }

             int temp= array[i];
      array[i]=array[j];
      array[j]=temp;


  }


    public  static  int[] bubbleSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex >0; lastUnsortedIndex--){
            for(int i = 0; i <lastUnsortedIndex;i++){
            if (intArray[i] >intArray[i+1]){
                swap(intArray,i,i+1);
            }}
        }
        return intArray;
        }


    public  static  int[] selectionSort(int[] intArray) {

        for (int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex >0; lastUnsortedIndex--){
            int largest = 0 ;
            for(int i = 1; i <=lastUnsortedIndex;i++){

                if (intArray[i] >intArray[largest]){
                    largest=i;

                }
                swap(intArray,largest,lastUnsortedIndex);
            }
        }
        return intArray;
    }
    public  static  int[] instertSort(int[] intArray) {

        for (int firstUnsortedIndex = 0;firstUnsortedIndex <intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
int i;
            for(i = firstUnsortedIndex; i >0&&intArray[i-1]>newElement;i--){

             intArray[i]=intArray[i-1];

            }
            intArray[i]=newElement;
        }
        return intArray;
    }

    public static int[] shelSort(int[] intArray) {
      for (int gap = intArray.length/2 ; gap >0;gap/=2){

          for (int i=gap; i< intArray.length; i++ ){
          int newElement = intArray[i];

          int j=i;
          while (j>=gap&&intArray[j-gap]>newElement){
              intArray[j]=intArray[j-gap];
              j-=gap;
          }
          intArray[j] = newElement;
          }

    }

return  intArray;
}
public static int[] mergeSort(int[] input,int start,int mid,int end){
     if(input[mid-1]<=input[mid])
}
}
