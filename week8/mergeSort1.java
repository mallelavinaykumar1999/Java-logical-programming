class mergeSort{
public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
 int[] result = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;
   while (i < arr1.length && j < arr2.length) {
    if (arr1[i] < arr2[j])
      {
      result[k] = arr1[i];
      
        i++;
        }
         else {
         result[k] = arr2[j];
          j++;
         }
       k++;
     }
     while (i < arr1.length) {
     result[k] = arr1[i];
       i++;
       k++;
     }
    while (j < arr2.length) {
      result[k] = arr2[j];
       j++;
       k++;
     }
   return result;
}
}
class  mergeSort1{
    public static void main(String args[]){
        int [] arr1={1,3,5,7};
        int [] arr2={2,4,6};
        int result[]=mergeSort.mergeSortedArrays(arr1,arr2);
        for(int i=0;i<result.length;i++){
            System.out.print(\t"+result[i]);
        }
    }
}