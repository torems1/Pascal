package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        poscal pl=new poscal();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix size A x B: ");
        int a= sc.nextInt();
        int[][] treg=pl.arrayBuilder(a);
        for(int=0;i<a;i++) {
            if(treg[i][j]!=0){
                System.out.print(treg[i][j]+ " ");
            }
        }
        System.out.print("\n");
    }
}
}
class poscal{
    public int[][] arrayBuilder(int a){
        int[] mrt =new int[a][a];
        mrt[0][0]=1;
        for( int i=1; i<mrt.length; i++){
            for (int j=1;j<mrt.lenght;j++){
                if(j<1){
                    mrt[i][j]=mrt[i-1][j]+mrt[i-1][j-1];
                }
                mrt[i][i]=1;
                mrt[i][0]=1;
            }
            return mrt;
        }
    }

}
	return str;
            }