interface Sortable{
    void sort(int nums[]);
}

class BubbleSort implements Sortable{

    @Override
    public void sort(int nums[])
    {
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable{

    @Override
    public void sort(int nums[])
    {
        int n=nums.length;

        for(int i=0;i<n-1;i++)
        {
            int minInd=i;
            for(int j=i+1;j<n;j++)
            {
                if(nums[minInd]>nums[j])
                {
                    minInd=j;
                }
            }

            int temp=nums[minInd];
            nums[minInd]=nums[i];
            nums[i]=temp;
        }
    }
}
public class prg9 {
    public static void main(String[] args) {
        Sortable bubblesort=new BubbleSort();
        Sortable selectionsort=new SelectionSort();

        int [] nums={90,65,34,2,32};
        bubblesort.sort(nums);

        int [] nums1={91,65,34,2,32};
        selectionsort.sort(nums1);


        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }

        for(int i=0;i<nums1.length;i++)
        {
            System.out.print(nums1[i]+" ");
        }
    }
}
