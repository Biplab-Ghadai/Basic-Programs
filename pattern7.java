class demo{
    public static void main(String args[])
    {
        String str = "JAVA DEVELOPER";
        String words[] = str.split(" ");
        String rev = "";
        String rev1 = "";
        for(int i=0; i<words[0].length(); i++)
        {
            rev = rev + words[0].charAt(i);
            System.out.print(rev+" "+words[1].charAt(0));
            System.out.println();
        }
        for(int i=0; i<words[1].length(); i++)
        {
            rev1 = rev1 + words[1].charAt(i+1);
            System.out.print(rev+" "+words[1].charAt(0)+rev1);
            System.out.println();
        }
    }
}