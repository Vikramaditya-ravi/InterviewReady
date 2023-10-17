class Solution {
    public static void flipArray(int[] arr, int pivot) {
        int n = arr.length;
        for (int i = 0; i < pivot / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[pivot - 1 - i];
            arr[pivot - 1 - i] = temp;
        }
    }

public static int indexOf(int[] arr, int num) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public List<Integer> pancakeSort(int[] arr) {
        int largest = arr.length;
        List<Integer> result = new ArrayList<>();


        while (largest >= 1) {

            int index = indexOf(arr, largest);

            if (index == largest-1) {
                largest -= 1;
            } else {
                result.add(index + 1);
                //flip the array from 0 to target +1;}
                flipArray(arr, index + 1);
                result.add(largest);
                flipArray(arr, largest );
                largest--;
            }

        }
        return result;
    }
}