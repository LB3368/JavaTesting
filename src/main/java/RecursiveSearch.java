public class RecursiveSearch {

    public static int recursiveSearch(String item, String[] items) {
        return recursiveSearchHelper(item, items, 0);
    }

    private static int recursiveSearchHelper(String item, String[] items, int index) {
        if (index >= items.length) {
            // Base case: item not found
            return -1;
        }

        if (items[index].equals(item)) {
            // Base case: item found
            return index;
        }

        // Recursive case: continue searching in the remaining elements
        return recursiveSearchHelper(item, items, index + 1);
    }

    public static void main(String[] args) {
        String[] items = {"hey", "there", "you"};
        String item1 = "hey";
        String item2 = "porcupine";

        int index1 = recursiveSearch(item1, items);
        int index2 = recursiveSearch(item2, items);

        System.out.println("Index of '" + item1 + "': " + index1);
        System.out.println("Index of '" + item2 + "': " + index2);
    }
}
