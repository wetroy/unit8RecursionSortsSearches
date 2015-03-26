import java.util.ArrayList;

public class ListMethodsRunner
{
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = ListMethods.makeList(100);
      ArrayList<Integer> tempList2 = ListMethods.deepClone(tempList);
      ArrayList<Integer> tempList3 = ListMethods.reverseList(tempList);
      if (tempList.size() == 0)
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (Integer i : tempList)
         {
            //System.out.println(i);
         }
         for (Integer i : tempList2)
         {
            //System.out.println(i);
         }
         for (Integer i : tempList3)
         {
            System.out.println(i);
         }
      }
   }
}