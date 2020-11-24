public class RecursiveBinarySearcher {

    public static int search(String[] array, String name){
        return binarySearch(array, 0, array.length - 1, name);
    }
    private static int binarySearch(String[] array, int first, int last, String name){
        for (int i = first; i < last; i++){
            if (array[i].equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
}
