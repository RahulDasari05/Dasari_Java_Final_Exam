package Question10;



import java.util.ArrayList;



public class Linear {



    /**

     * @param args the command line arguments

     */







     public static int search(ArrayList<Integer> arr, int start, int end, int index)

     {

          if (end < start)

          {

            return -1;

          }

          if (arr.get(start) == index)

          {

            return start;

          }

          if (arr.get(start) == index)

          {

            return end;

          }



          return search(arr, start+1, end-1, index);

     }    
    public static void main(String[] args) {

        // TODO code application logic here

        System.out.println("Question 9 by Rahul Dasari");

         ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);

        arr.add(20);

        arr.add(30);

        arr.add(40);

        arr.add(50);

        arr.add(60);

        arr.add(70);

        arr.add(70);

        int index = search(arr, 0, arr.size()-1, 40);



        if(index>-1)

        {

            System.out.println("Element found at index "+index);

        }

        else

        {

            System.out.println("Element not found");

        }

    }



}


