class balanced
{
    public class odd {static int isBalanced(int[] a) {
    int count=0;

    for(int i=0; i<a.length; i++) {
        for (int j = 0; j < a.length; j++)
            if (a[i] == a[j])
                count++;
        break;


    }
    if(count>3)
        return 0;
    return 1;
}
    public static void main(String[] args) {

        System.out.println("return value is"+ isBalanced(new int[] {0,1,2,6,6}));
    }}
}
