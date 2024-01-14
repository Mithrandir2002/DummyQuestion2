public class MergeSort 
{
    public int[] merge(int[] arr, int left, int right)
    {
        int[] newArr = new int[right - left + 1];
        int mid = (right + left) / 2;
        int hold = mid;
        int i = 0;
        while (left <= hold && mid + 1 <= right)
        {
            if (arr[left] >= arr[mid+1])
            {
                newArr[i] = arr[mid+1];
                mid++;
            }
            else
            {
                newArr[i] = arr[left];
                left++;
            }
            i++;
        }
    
        if(left > hold && (mid + 1) <= right)
        {
            for(int k = mid + 1; k <= right; k++)
            {
                newArr[i] = arr[k];
                i++;
            }
        }
        if((mid + 1) > right && left <= hold)
        {
            for(int k = left; k <= hold; k++)
            {
                newArr[i] = arr[k];
                i++;
            }
        }
        return newArr;
    }
    public void mergeSort(int[] arr, int left, int right)
    {
        if (right - left == 0)
        {
            return;
        }
        else
        {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            int[] arrN = merge(arr, left, right);
            for (int i = left; i <= right; i++)
            {
                arr[i] = arrN[i-left];
            }
            return;
        }
    }    
}