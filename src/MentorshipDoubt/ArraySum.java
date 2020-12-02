package MentorshipDoubt;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {

    }

    public static int tripletSum(int [] arr,int num){
        Arrays.sort(arr);
        int n=arr.length;

        int numTriplets=0;
        for(int i=0;i<n;i++){
            int pairSumFor=num-arr[i];
            int numPairs=pairSum(arr,(i+1),(n-1),pairSumFor);
            numTriplets=numTriplets+numPairs;
        }
        return  numTriplets;
    }

    private static int pairSum(int [] arr,int startIndex,int endIndex,int num){

        int numPair=0;

        while(startIndex<endIndex){
            if(arr[startIndex]+arr[endIndex]<num)
                startIndex++;
            else if (arr[startIndex]+arr[endIndex]>num)
                endIndex--;
            else {
                int elementAtStart=arr[startIndex];
                int elementAtEnd=arr[endIndex];

                if(elementAtStart==elementAtEnd){
                    int totalElementsFromStartToEnd=(endIndex-startIndex)+1;
                    numPair+=(totalElementsFromStartToEnd*(totalElementsFromStartToEnd-1)/2);
                    return numPair;
                }
                int temStartIndex=startIndex+1;
                int temEndIndex=endIndex-1;

                while(temStartIndex<=temEndIndex && arr[temStartIndex]==elementAtStart){
                    temStartIndex+=1;
                }
                while (temEndIndex>=temStartIndex && arr[temEndIndex]==elementAtEnd){
                    temEndIndex-=1;
                }

                int totalElementsFromStart=(temStartIndex-startIndex);
                int totalElemenstFromEnd=(endIndex-temEndIndex);
                numPair+=(totalElementsFromStart+totalElemenstFromEnd);
                startIndex=temStartIndex;
                endIndex=temEndIndex;
            }
        }
        return numPair;
    }
}
