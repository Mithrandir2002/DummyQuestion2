public class ModifiedArray 
{   
    public int binarySearch(int[] arr, int num, int low, int high)
    {
        if (low > high)
        {
            return -1;
        }
        int mid = (low + high)/2;
        if (num > arr[mid])
        {
            return binarySearch(arr, num, mid + 1, high);
        }
        else if (num < arr[mid])
        {
            return binarySearch(arr, num, low, mid - 1);
        }
        else
        {
            return mid;
        }
    }

    public int countingNumber(int[] arr, int num, int left, int right)
    {
        int a = binarySearch(arr, num, left, right);
        if (a == -1)
        {
            return 0;
        }
        else
        {
            return 1 + countingNumber(arr, num, a + 1, right) + countingNumber(arr, num, left, a - 1);
        }
    }

    public int[] modifiedArr(int[] arr, int i)
    {
        if (i >= arr.length)
        {
            return arr;
        }
        else
        {
            int count = countingNumber(arr, arr[i], 0, arr.length - 1);
            if (count > 1)
            {
                int[] newArr = new int[arr.length - 1];
                for (int id = 0, k = 0; id < newArr.length && k < arr.length; id++, k++)
                {
                    if (id == i)
                    {
                        k = k + 1;
                        newArr[id] = arr[k];
                    }
                    else
                    {
                        newArr[id] = arr[k];
                    }
                }
                return modifiedArr(newArr, i);
            }
            else
            {
                i++;
                return modifiedArr(arr, i);
            }
        }
    }
}