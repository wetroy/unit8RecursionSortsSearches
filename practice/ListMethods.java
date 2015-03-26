import java.util.*;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> tempList = new ArrayList<Integer>(); 
        if (n <= 0)  // The smallest list we can make
        {
            return tempList;
        }
        else        // All other size lists are created here
        {
            tempList = makeList(n - 1);
            tempList.add(n);
        }
        return tempList;
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();  
        for (Integer i : tList)
        {
            list.add(0, new Integer(i));
        }
        return list;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        if(tList.size() <= 1)
        {
            return tList;
        }
        else
        {
            for(Integer i:tList)
            {
                list.add(new Integer(i));
            }
            int first = list.get(0);
            list.remove(0);
            list = reverseList(list);            
            list.add(first);
        }
        return list;
    }
}