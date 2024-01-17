import java.util.*;
class demo
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        int arr[] = {1, 2, 4, 2, 3, 5, 4, 1, 3, 6, 7};
        for(int i=arr.length-1; i>0; i--)
        {
            if(arr[i] != 4)
            {
                list.add(arr[i]);
            }
            else{
                break;
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}