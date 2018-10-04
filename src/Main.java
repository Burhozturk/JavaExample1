public class Main
{
    public static void main(String[] args)
    {
        int marks[]={72,85,93,29,85};

        int sum=0;

        for(int counter=0;counter<marks.length;counter++)
        {
            System.out.println(marks[counter]);
            sum=sum+marks[counter];


        }
        System.out.println("The sum is" +sum);

        for(int nummer : marks)
        {
            System.out.println("Foreach:" +nummer);
        }

    }
}
