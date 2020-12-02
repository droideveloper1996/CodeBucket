package Miscellaneous;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int matrix[][]={
                {6,9,7},
                {8,5},
                {9,2}
        };

        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        for(int i=0;i<matrix[0].length;i++){
            int sum=0;
            for(int j=0;j<matrix.length;j++){
//                System.out.print(matrix[j][i]+" ");
                sum=sum+matrix[j][i];
            }
            System.out.println();
        }

//        for(int i=0;i<matrix[0].length;i++){
//            int sum=0;
//            for(int j=0;j<matrix.length;j++){
//                sum=sum+matrix[j][i];
//            }
//            System.out.println(sum);
//        }
//        findLargest(matrix);
    }

    public static void findLargest(int mat[][]){


        int rowMax=Integer.MIN_VALUE;
        int colMax=Integer.MIN_VALUE;
        int maxRowIndex=-1;
        int maxColIndex=-1;

        //Finding Row sum

        for(int i=0;i<mat.length;i++){
            int tempSum=0;
            for(int j=0;j<mat[0].length;j++){

                tempSum=tempSum+mat[i][j];

            }
            if(tempSum>rowMax){
                rowMax=tempSum;
                maxRowIndex=i;
            }
        }

        //Col Sum

//        for(int i=0;i<mat.length;i++){
//            int tempSum=0;
//            for(int j=0;j<mat[0].length;j++){
//                tempSum=tempSum+mat[j][i];
//            }
//            if(tempSum>rowMax){
//                colMax=tempSum;
//                maxColIndex=i;
//            }
//        }

        for(int i = 0; i < mat[0].length; i++){
            int tempSum=0;
            for(int j = 0; j < mat.length; j++){
                tempSum=tempSum+mat[j][i];
            }
            if(tempSum>rowMax){
                colMax=tempSum;
                maxColIndex=i;
            }
        }

        if(rowMax>colMax){
            System.out.print("row "+maxRowIndex+" "+rowMax);
        }
        else{
            System.out.print("column "+maxColIndex+" "+colMax);
        }


    }

}
