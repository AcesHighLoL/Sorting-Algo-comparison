class quicksort {
    private static void quickSortAlgo(int[] list, int begin, int end) {
        int temp;
        int pivot = partition(begin, end);

        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;

        pivot = end;

        int i = begin,
                j = end - 1;

        boolean iterationCompleted = false;
        while (!iterationCompleted) {
            while (list[i] < list[pivot])
                i++;
            while ((j >= 0) && (list[pivot] < list[j]))
                j--;

            if (i < j) {
                // swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;

                i++;
                j--;
            } else
                iterationCompleted = true;
        }

        // swap list[i] and list[pivot]
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;

        if (begin < i - 1)
            quickSortAlgo(list, begin, i - 1);
        if (i + 1 < end)
            quickSortAlgo(list, i + 1, end);
    }

 
    private static int partition(int b, int e) {
        return (b + e) / 2;
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 220, 49, 54, 26, 93, 17, 77, 31, 156, 44, 55, 20, 105 };
        System.out.println("--------------------Running Quicksort--------------------");
        System.out.println("Given Array");
        printArray(arr);

        quicksort test = new quicksort();
        test.quickSortAlgo(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

}
