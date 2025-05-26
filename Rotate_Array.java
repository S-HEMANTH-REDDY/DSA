class Solution {
    public void swap(int start, int end, int[] arr)
    {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;}
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n)
       {
        k=k%n;
       }
       if(n==k)
       {
        return ;
       }
        swap(0, n-1,nums);
        swap(0,k-1, nums);
        swap(k, n-1, nums);
        }
    }
