package Miscellaneous;

public class PrimeSieve {

    public static void main(String[] args) {
        int c=0;
        int arr[]=getPrimeSieve(1000000);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                System.out.println(i);
                ++c;
            }
        }

        System.out.println("Total Prime Number Count is : "+c);
    }


    static void getPrime(int n){
        /**
         * Brute Force
         * O(n2) technique
         */
        for (int i=2;i<n;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println(i);
            }
        }
    }

    public static int[] getPrimeSieve(int n){
        int prime[]=new int[1000000];
        for(int i=3;i<prime.length;i+=2){
            prime[i]=1;
        }

        for(int i=3;i<prime.length;i+=2){
            if(prime[i]==1){
                for(int j=2*i;j<prime.length;j=j+i){
                    prime[j]=0;
                }
            }
        }
        prime[2]=1;
        prime[0]=prime[1]=0;
        return prime;
    }



}
