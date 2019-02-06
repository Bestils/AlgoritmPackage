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
public static void mergeSort(int[] input,int start,int mid,int end){
     if(input[mid-1]<=input[mid]){
         return;
     }
     int j = mid;
     int i = start;
     int tempIndex=0;

     int[] temp = new int[end- start];
     while (i<mid && j< end){
         temp[tempIndex++]=input[i] <= input[j] ? input[i++] : input[j++];
     }
     System.arraycopy(input,i,input,start+tempIndex,mid-1);
     System.arraycopy(temp,0,input,start,tempIndex);
}
public static void quickSort(int[] input,int start,int end){
      if (end - start <2 ){
          return ;
      }
      int pivotIndex = partition(input,start,end);
      quickSort(input,start,pivotIndex);
      quickSort(input,pivotIndex+1,end);


}
public static int partition(int[] input,int start,int end){
      int pivot = input[start];
      int i = start;
      int j = end;

      while (i < j ){
          while (i < j && input[--j]>= pivot);
          if (i<j){
              input[i]= input[j];
          }
          while (i < j && input[++j]<= pivot);
          if (i<j){
              input[j]= input[i];
          }
      }
      input[j]=pivot ;
      return j;
}


}
