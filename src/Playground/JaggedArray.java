package Playground;

public class JaggedArray {
    public static void main(String[] args) {
        int c[][]=new int[8][];

        for(int i=0;i<c.length;i++){
            int row[]=new int[2*i+5];
            for(int j=0;j<row.length;j++){
                row[j]=(i+1)*(j+1);
            }
            c[i]=row;
        }

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
