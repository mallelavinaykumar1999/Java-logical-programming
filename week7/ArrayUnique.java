public class ArrayUnique {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4};
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique==true) {
                System.out.println(arr[i]);
            }
        }
    }
}