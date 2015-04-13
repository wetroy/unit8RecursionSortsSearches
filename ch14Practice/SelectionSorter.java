import java.util.Arrays;
public class SelectionSorter
{
    public static void sort(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            int smallestValue = a[i];
            int smallestIndex = i;
            for(int j = i; j <a.length;j++)
            {
                if(a[j] < smallestValue)
                {
                    smallestValue = a[j];
                    smallestIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;
        }
        
    }
    
        public static void rsort(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            int smallestValue = a[i];
            int smallestIndex = i;
            for(int j = i; j <a.length;j++)
            {
                if(a[j] > smallestValue)
                {
                    smallestValue = a[j];
                    smallestIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;
        }
        
    }
    
    public static void main(String[] args)
    {
        int[] a = new int[20];
        for(int i = 0; i <a.length;i++)
        {
            a[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
        rsort(a);
        System.out.println(Arrays.toString(a));
    }
}
