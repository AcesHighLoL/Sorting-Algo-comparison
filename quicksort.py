def partition(arr, low, high):
    i = (low-1)         # index of smaller element
    pivot = arr[high]     # pivot

    for j in range(low, high):

        # If current element is smaller than or
        # equal to pivot
        if arr[j] <= pivot:

            # increment index of smaller element
            i = i+1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i+1], arr[high] = arr[high], arr[i+1]
    return (i+1)


def quickSort(arr, low, high):
    if len(arr) == 1:
        return arr
    if low < high:

        pi = partition(arr, low, high)

        quickSort(arr, low, pi-1)
        quickSort(arr, pi+1, high)


arr = [220, 49, 54, 26, 93, 17, 77, 31, 156, 44, 55, 20, 105]
print('--------------------Running Quicksort--------------------')
print('Before Merge: ')
print(arr)
n = len(arr)
quickSort(arr, 0, n-1)
print('After Quicksort')
print(arr)
