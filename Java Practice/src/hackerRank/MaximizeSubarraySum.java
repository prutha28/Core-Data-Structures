package hackerRank;

import java.util.Scanner;

public class MaximizeSubarraySum {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in) ;
        int T = sc.nextInt() ;
        
        int i = 1 ;
        while( i <= T){
            int n = sc.nextInt() ;
            int a[] = new int[n] ;
            
            for( int j = 0 ; j <n ; j++){
                a[j]= sc.nextInt() ;
            }
//            System.out.println();
            System.out.print(maxContSum(a, 0 , n-1) + " ");
            maxNonContSum(a) ;
            i++ ;
        }
    }
    
    
    public static void maxNonContSum(int[] a){
        int sum = 0 ;
        for( int i = 0 ; i <a.length; i++){
            if( a[i] > 0){
                sum += a[i] ;
            }
        }
        System.out.print(sum) ;
    }
    
    
    
    public static int maxContSum(int[] a, int start, int end){
        if( start == end) 
            return a[start] ;
        
        return MAX(maxContSum(a, start, --end) + a[end] , a[end]) ;
        
    }
    
    public static int MAX( int i , int j){
        return ( i >= j) ? i : j  ;
    }
    
}