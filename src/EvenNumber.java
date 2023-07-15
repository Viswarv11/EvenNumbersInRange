import java.util.Scanner;

public class EvenNumber {
    public static void evenCount(int[] array,int[][] range,int q)
    {
        int p[] = new int[array.length];
        p[0]=array[0]%2==0?1:0;
        for(int i=1;i< array.length;i++)
        {
            int temp=array[i]%2==0?1:0;
            p[i] = p[i-1]+ temp;

        }
        int result[] = new int[q];
        int i=0;
        while(q>0)
        {
            int l=range[q-1][0];
            int r=range[q-1][1];
            if(l==0)
            {

                result[i]=p[r];
            }
            else{

                result[i]=p[r]-p[l-1];
            }
            q--;
            i++;
        }
        for(i = range.length-1;i>=0 ;i--)
        {
            System.out.println(result[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0;i<size;i++)
        {
            array[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[][] range = new int[q][2];
        for(int i=0; i< q;i++)
        {
            for(int j=0;j<2;j++)
            {
                range[i][j]=scanner.nextInt();
            }
        }
        evenCount(array,range,q);

    }
}
