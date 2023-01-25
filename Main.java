public class Main
{
    static int lin_search(int[] arr, int key)
    {
        for(int i = 0; i<arr.length; ++i)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    static int binarySearch(int arr[], int first, int last, int key)
    {
        if (last>=first)
        {
            int mid = (last + first)/2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (arr[mid] > key)
            {
                return binarySearch(arr, first, mid-1, key);//search in left subarray
            }
            else
            {
                return binarySearch(arr, mid+1, last, key);//search in right subarray
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        // Linear Search
        int[] arr = {5, 15, 7, 9, 12};
        int ind = lin_search(arr, 15);
        System.out.println("The element 15 is found at index " + ind );
    }
}
