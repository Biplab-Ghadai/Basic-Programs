class demo{
    public static void main(String args[])
    {
        String str = "you are beautiful";
        String words[] = str.split(" ");
        String rev = "";
        {
            for(int i=0; i<words.length; i++)
            {
                String word = words[i];
                String rev1 = "";
                for(int j=word.length()-1; j>=0; j--)
                {
                    rev1 = rev1 + word.charAt(j);
                }
                rev = rev + rev1 + " ";
            }
            System.out.println(rev);
        }
    }
}