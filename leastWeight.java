import java.util.*;
class Solution{
    private static boolean bsearch(int arr[],int low,int high,int tar){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar)
                return true;
            else if(arr[mid]<tar)
                low=mid+1;
            else
                high=mid-1;
                
        }
        return false;
    }
    public static int small(int mat[][]){
        if(mat.length==1)
            return mat[0][0];
            for(int ele:mat[0]){
                int c=0;
                for(int i=1;i<mat.length;i++){
                    if(bsearch(mat[i],0,mat[i].length-1,ele))
                        c++;
                    else{
                        break;
                    }
                }
                if(c==mat.length-1)
                    return ele;
                
            }
            return -1;
            
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(small(arr));
    }
}
