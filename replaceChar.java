class repalcecharacter{
    public static void main(String args[])
    {
        String str = "biplab";
        char arr[] = str.toCharArray();
        char ch = 't';
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]=='p')
            {
                char temp = arr[i];
                arr[i] = ch;
                ch = temp;
            }
            System.out.print(arr[i]);
        }
    }
}