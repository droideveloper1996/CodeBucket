//package MentorshipDoubt;
//
//public class RecursiveOccurnceOfX {
//    public static void main(String[] args) {
//
//    }
//
////    static int[] getAllOccurance(int a[],int x){
////        if(a.length==0){
////            int result[]=new int[0];
////            return result;
////        }
////        int smallProblem[]=new int[a.length-1];
////        int result[]=new int[];
////        for(int i=1;i<a.length;i++){
////            smallProblem[i-1]=a[i];
////        }
////        int smallAns[]=getAllOccurance(smallProblem,x);
////        if(a[0]==x){
////            result[0]=0;
////            for(int i=0;i<smallAns.length;i++){
////
////            }
////        }
//
//    }
//
//
//    public int[] findIndexofNumber(int input[],
//                                     int x, int start)
//    {
//        if (start == input.length) {
//            int[] ans = new int[0]; // empty array
//            return ans;
//        }
//        int[] smallIndex = findIndexofNumber(input, x,
//                start + 1);
//        if (input[start] == x) {
//            int[] myAns = new int[smallIndex.length + 1];
//            myAns[0] = start;
//            for (int i = 0; i < smallIndex.length; i++) {
//
//
//                myAns[i + 1] = smallIndex[i];
//            }
//            return myAns;
//        }
//        else {
//            return smallIndex;
//        }
//    }
//
//    static int convertStringToInt(String str)
//    {
//
//        if (str.length() == 1)
//            return (str.charAt(0) - '0');
//        double y = convertStringToInt(str.substring(1));
//
//        double x = str.charAt(0) - '0';
//
//        x = x * Math.pow(10, str.length() - 1) + y;
//        return (int)(x);
//    }
//}
