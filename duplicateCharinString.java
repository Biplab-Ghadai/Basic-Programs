class demo{
    public static void main(String args[]){
        String str = "biplab";
        char arr[] = str.toCharArray();
        boolean flag = true;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    flag = false;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("Dup Present");
        }
        else{
            System.out.println("Dup not Present");
        }
    }
}