package search.a2_binary;

public class BinarySearch {

    public int bSearchRec(int[] array, int target) {
        return bSearchRec(array, target, 0, array.length - 1);
    }

    private int bSearchRec(int[] array, int target, int left, int right) {
        if (right < left) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == target) {
            return middle;
        }
        if (target < array[middle]) {
            return bSearchRec(array, target, left, middle - 1);
        }
        return bSearchRec(array, target, middle + 1, right);
    }
}
