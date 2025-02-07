public class BinarySearch{

    public int binarySearchAlgo(int arr[], int x)
    {
        int left = 0;
        int right=arr.length;

        while(left <= right)
        {
            int mid = (left+right)/2;

            if(arr[mid] == x)
            {
                return mid;
            }
            else if(arr[mid] < x)
            {
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }

        return -1;
    }
}