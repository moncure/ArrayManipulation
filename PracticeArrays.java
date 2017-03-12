
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amy Moncure
 */


public class PracticeArrays {
    
    
    public boolean firstLast6(int[] nums){
        /**
         * Given an array of ints, return true if 6 appears as either the first 
         * or last element in the array. 
         * The array will be length 1 or more.
         */
        
        boolean found = false;
        
        if (nums[0]==6 || nums[nums.length -  1]==6)
            found = true;
        
        return found;
    }
    
    private boolean firstLast6Test(){
        int a[] = {1,2,6};
        int b[] = {6,1,2,3};
        int c[]= {13,6,1,2,3};
        boolean case1 = firstLast6(a);// true
        boolean case2 = firstLast6(b); // → true
        boolean case3 = !firstLast6(c); // → false
        
        return (case1 && case2 && case3);
        
    }
    
    public boolean commonEnd(int[] a, int[] b){
        /**
         * Given 2 arrays of ints, a and b, return true if they have 
         * the same first element or they have the same last element. 
         * Both arrays will be length 1 or more.

         */
        
        
        
        if (a[0] == b[0] || a[a.length-1] == b[b.length -1])
            return true;
        return false;
    }
    
    private boolean commonEndTest(){
        int[] a1 = {1,2,3}; int[] a2 = {7,3};
        int[] b2 = {7,3,2};
        int[] c2 = {1,3}; 
        boolean case1 = commonEnd(a1, a2); // → true
        boolean case2 = !commonEnd(a1, b2); //→ false
        boolean case3 = commonEnd(a1, c2); // → true
        
        return (case1 && case2 && case3);
        
    }
    
    public int[] reverse3(int[] nums){
        /**
         * Given an array of ints length 3, return a new array with the elements
         * in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
         */
        int length = nums.length;
        int[] reversedArray = new int[length];
       
        for(int i=0; i<length; i++)
            reversedArray[i] = nums[length -1 - i];
        return reversedArray;
        
    }
    
    
    
    private boolean reverse3Test(){
        int[] a1 = {1,2,3};  int[] a2 = {3,2,1};
        int[] b1 = {5,11,9}; int[] b2 = {9,11,5};
        int[] c1 = {7,0,0}; int[] c2 = {0,0,7};
        
        boolean case1 = Arrays.equals(reverse3(a1),a2);
        boolean case2 = Arrays.equals(reverse3(b1),b2);
        boolean case3 = Arrays.equals(reverse3(c1),c2);
        
        
        return (case1 && case2 && case3);
    }
    
    public int[] middleWay(int[] a, int[] b){
        /**
         * Given 2 int arrays, a and b, each length 3, return a new array 
         * length 2 containing their middle elements.
         */
        int[] middleValues = new int[2];
        middleValues[0] = a[1]; middleValues[1]= b[1];
        return middleValues;
    }
    
    private boolean middleWayTest(){
        
        int[] a1= {1,2,3}; int[] a2={4,5,6}; int[] am = {2,5};
        int[] b1= {7,7,7}; int[] b2={3,8,0}; int[] bm = {7,8};
        int[] c1= {5,2,9}; int[] c2={1,4,5}; int[] cm = {2,4};
        
        boolean case1 = Arrays.equals(middleWay(a1,a2),am);
        boolean case2 = Arrays.equals(middleWay(b1,b2),bm);
        boolean case3 = Arrays.equals(middleWay(c1,c2),cm);
        
        return (case1 && case2 && case3);
    }
    
    public boolean no23(int[] a){
        /**
         * 
         *Given an int array length 2, return true if it does not contain a 2 or 3.
         */
        boolean found = false;
        
        for (int i=0; i<2;i++)
            if (a[i] == 2 || a[i] == 3) {
                found = true;
                break;
            }
            
        return found;
    }
    
    private boolean no23Test(){
        int[] a={4,5};
        int[] b={4,2};
        int[] c={3,4};
        int[] d={2,2};
        
        boolean case1 = !no23(a); //false
        boolean case2 = no23(b); //false
        boolean case3 = no23(c); //true
        boolean case4 = no23(d); //true
        
        return (case1 && case2 && case3 && case4);
    }
    
    public int[] fix23(int[] nums){
        /**
         * Given an int array length 3, if there is a 2 in the array immediately 
         * followed by a 3, set the 3 element to 0. Return the changed array.
         */
        int length = nums.length;
        for (int i= 0; i < length - 1; i++ )
            if (nums[i] == 2 && nums[i+1] ==3)
                nums[i+1]= 0;
        return nums;
    }
    
    private boolean fix23Test(){
        int[] a1 = {1,2,3}; int[] a2 = {1,2,0};
        int[] b1 = {2,3,5}; int[] b2={2,0,5};
        int[] c1 = {1,2,1};
        
        
        boolean case1 = Arrays.equals(fix23(a1),a2);
        boolean case2 = Arrays.equals(fix23(b1),b2); 
        boolean case3 = Arrays.equals(fix23(c1),c1);
        
        return (case1 && case2 && case3);

    }
    
    public int[] makeMiddle(int[] nums){
        /**
         * Given an array of ints of even length, 
         * return a new array length 2 containing the middle two elements 
         * from the original array. 
         * The original array will be length 2 or more.

         */
        int length = nums.length;
        int[] middles = new int[2];
        middles[0] = nums[length/2 -1];
        middles[1] = nums[length/2];
        
        return middles;
    }
    
    private boolean makeMiddleTest(){
        int[] a1 = {1,2,3,4}; int[] am= {2,3};
        int[] b1 = { 7,1,2,3,4,9};
        int[] c1 = {2,3};
        
        boolean case1 = Arrays.equals(makeMiddle(a1),am);
        boolean case2 = Arrays.equals(makeMiddle(b1),am);
        boolean case3 = Arrays.equals(makeMiddle(c1),am);
        
        return (case1 && case2 && case3);
    }
    
    public int[] midThree(int[] nums){
        /**
         * 
         *Given an array of ints of odd length, 
         * return a new array length 3 containing the 
         * elements from the middle of the array. 
         * The array length will be at least 3.

         */
        int[] mids = new int[3];
        int length = nums.length;
        
        for(int i =0; i < 3; i++)
            mids[i]=nums[length/2 - 1 + i];
        
        return mids;
    }
    
    private boolean midThreeTest(){
        int[] a1 = {1,2,3,4,5};  int[] a2 = {2,3,4};
        int[] b1 = {8,6,7,5,3,0,9}; int[] b2 = {7,5,3};
        int[] c1 = {1,2,3};
        
        boolean case1 = Arrays.equals(midThree(a1), a2);
        boolean case2 = Arrays.equals(midThree(b1),b2);
        boolean case3 = Arrays.equals(midThree(c1),c1);
        
        return (case1 && case2 && case3);
        
    }
    
    public int sum13(int[] nums){
        /**
         * Return the sum of the numbers in the array, 
         * returning 0 for an empty array. 
         * Except the number 13 is very unlucky, 
         * so it does not count and numbers that come immediately after a 13 
         * also do not count.

         */
        int sum = 0;
        int length = nums.length;
        boolean is13 = false;  
        
        for(int i=0; i<length; i++)
            if(nums[i] != 13)
                if (!is13) {  //safe to add to the count
                    sum = sum + nums[i];
                    is13 = false;
                }else is13 = false;
            else is13 = true;
        
        return sum;
            
           
    }
    
    private boolean sum13Test(){
    int[] a = {1,2,2,1}; int aSum = 6;
    int[] b = {1,1};     int bSum = 2;
    int[] c= {1,2,2,1,13,4,1}; int cSum=7;
    
    boolean case1 = sum13(a) == aSum;
    boolean case2 = sum13(b) == bSum;
    boolean case3 = sum13(c) == cSum;
    
    return (case1 && case2 && case3);
    }    
    
    public int[] without10(int[] nums){
        /**
         * Return a version of the given array where all the 10's have been 
         * removed. 
         * The remaining elements should shift left towards the start of the 
         * array as needed, and the empty spaces a the end of the array should
         * be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
         * You may modify and return the given array or make a new array.
         */
        
        int length = nums.length;
        int writeIndex = 0;
        
        //Move all valid data values to the front of the array
        for(int i = 0; i<length; i++){
            //if the number is 10 or 0, swap with the next index
            if(nums[i] !=10){
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        //fill the rest of the array with 0s
        for(int i = writeIndex; writeIndex<length; writeIndex++)
            nums[writeIndex]=0;
        
        return nums;
        
    }
    
    private boolean without10Test(){
        int[] a1 ={1,10,10,2}; int[] a2={1,2,0,0};
        int[] b1 = {10,2,10}; int[] b2={2,0,0};
        int[] c1 = {1,99,10}; int[] c2={1,99,0};
        
        boolean case1 = Arrays.equals(without10(a1), a2);
        boolean case2 = Arrays.equals(without10(b1),b2);
        boolean case3 = Arrays.equals(without10(c1), c2);
        
        return (case1 && case2 && case3);
        
    }
    
    public String[] fizzBuzz(int start, int end){
        String[] fb = new String[end-1];
        
        for(int i=start; i<end; i++)
            if (i%3 == 0 && i%5 == 0)
                fb[i-1] = "FizzBuzz";
            else if(i%3 == 0)
                fb[i-1] = "Fizz";
            else if(i%5 == 0)
                fb[i-1] = "Buzz";
            else fb[i-1] = Integer.toString(i);
        
        //for(int i=0; i<fb.length; i++)
        //    System.out.print(fb[i] + " ");
        
        // System.out.println("");
        return fb;
    }
    
    private boolean fizzBuzzTest(){
        String[] a= {"1","2","Fizz","4","Buzz"};
        String[] b={"1","2","Fizz","4","Buzz","Fizz","7"};
        String[] c={"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};
        
        boolean case1 = Arrays.equals(fizzBuzz(1,6),a);
        boolean case2 = Arrays.equals(fizzBuzz(1,8),b);
        boolean case3 = Arrays.equals(fizzBuzz(1,11),c);
        
        return (case1 && case2 && case3);
    }
    
    public int bigDiff(int[] nums){
        /**
         * Given an array length 1 or more of ints, return the difference between 
         * the largest and smallest values in the array. 
         * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods 
         * return the smaller or larger of two values.
         */
        int max = nums[0];
        int min = nums[0];
        
        for (int i=0; i<nums.length; i++)
        {
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        return (max-min);
        
    }
    
    private boolean bigDiffTest(){
        int[] a={10,3,5,6}; int aDiff=7;
        int[] b ={7,2,10,9}; int bDiff=8;
        int[] c = {2,10,7,2}; int cDiff= 8;
        
        boolean case1 = bigDiff(a) == aDiff;
        boolean case2 = bigDiff(b) == bDiff;
        boolean case3 = bigDiff(c) == cDiff;
        
        return (case1 && case2 && case3);
        
    }
    
   public boolean canBalance(int[] nums){
       /**
        * Given a non-empty array, 
        * return true if there is a place to split the array so that the sum 
        * of the numbers on one side is equal to the sum of the numbers on the other side.

        */
       
       int split = 1; 
       int length = nums.length;
       int side1=0;
       int side2=0;
       
       
       while(split < length) {
            for (int i=0; i<split; i++)  //sum the first side;
                side1=side1+nums[i];
            for(int i=split; i<length; i++) //sum the second side
                 side2=side2+nums[i];
       
            if(side1 == side2)
                  return true;
             else{
                  side1=0;
                  side2=0;
                 split++;
              }
         }//end while
       
       return false;
       
       
   }
   
   private boolean canBalanceTest(){
       int[] a = {1,1,1,2,1};  //true
       int[] b = {2,1,1,2,1};  //false
       int[] c= {10,10}; //true
       
       boolean case1 = canBalance(a);
       boolean case2 = !canBalance(b);
       boolean case3 = canBalance(c);
       
       return (case1 && case2 && case3);
       
   }
   
   public int[] seriesUp(int n){
       /**
        *Given n>=0, create an array with the pattern 
        * {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} 
        * (spaces added to show the grouping). 
        * Note that the length of the array will be 1 + 2 + 3 ... + n, 
        * which is known to sum to exactly n*(n + 1)/2. 
        */
       
       int[] series = new int[(n*(n+1))/2];
       int index=0;
       
       for(int i=1; i<=n; i++)
          for(int j=1; j<=i; j++){
              series[index]=j;
              index++;
          }
       
       return series;
           
       
       
       
   }
       
   private boolean seriesUpTest(){
       int aStart = 3; int[] a = {1,1,2,1,2,3};
       int bStart = 4; int[] b = {1,1,2,1,2,3,1,2,3,4};
       int cStart = 2; int[] c = {1,1,2};
       
       boolean case1 = Arrays.equals(seriesUp(3),a);
       boolean case2 = Arrays.equals(seriesUp(4), b);
       boolean case3 = Arrays.equals(seriesUp(2), c);
       
       return(case1 && case2 && case3);
       
   }
   
   public boolean linearIn(int[] outer, int[] inner){
       /**
        * Given two arrays of ints sorted in increasing order, 
        * outer and inner, 
        * return true if all of the numbers in inner appear in outer. 
        * The best solution makes only a single "linear" pass of both arrays, 
        * taking advantage of the fact that both arrays are already in sorted order.

        */
       
      
       
       int innerLength = inner.length;   //3
       int outerLength = outer.length;   //2
       int innerIndex = 0;
       int outerIndex = 0;
      
       
       
       while(innerIndex < innerLength && outerIndex < outerLength
               && outer[outerIndex] <= inner[innerIndex])
           if (outer[outerIndex] == inner[innerIndex])
               innerIndex++;
           else outerIndex++;
           
       
       return (innerIndex == innerLength); //all items found
           
       
       
            
       
   }
   
   private boolean linearInTest(){
       int[] a1 ={1,2,4,6}; int[] a2={2,4}; //true
       int[] b1 ={1,2,4,6}; int[] b2={2,3,4}; //false
       int[] c1= {1,2,4,4,6}; int[] c2 = {2,4}; //true
       int[] d1={1,2,3}; int[] d2={2,4}; //false
       
       boolean case1 = linearIn(a1,a2);
       boolean case2 = !linearIn(b1,b2);
       boolean case3 = linearIn(c1,c2);
       boolean case4 = !linearIn(d1,d2);
       
       return (case1 && case2 && case3 && case4);

      
   }
    
    public boolean practiceArraysUnitTest(){
        
        if (!firstLast6Test()){
            System.out.println("firstLast6Test() is broken");
            return false;
        }
        
        if (!commonEndTest()){
            System.out.println("firstLast6Test() is broken");
            return false;
        }
        
        if (!reverse3Test()){
            System.out.println("reverse3Test() is broken");
            return false;
        }
        
        if (!middleWayTest()){
            System.out.println("middleWayTest() is broken");
            return false;
        }
        
        if (!no23Test()){
            System.out.println("no23Test() is broken");
            return false;
        }
        
         if (!fix23Test()){
            System.out.println("no23Test() is broken");
            return false;
        }
         
        if (!makeMiddleTest()){
            System.out.println("makeMiddleTest() is broken");
            return false;
        }
        
        if (!midThreeTest()){
            System.out.println("makeMiddleTest() is broken");
            return false;
        }
        
        if (!sum13Test()){
            System.out.println("sum13Test() is broken");
            return false;
        }
        
        if (!without10Test()){
            System.out.println("without10Test() is broken");
            return false;
        }
        
        if (!fizzBuzzTest()){
            System.out.println("fizzBuzzTest() is broken");
            return false;
        }
        
        if (!bigDiffTest()){
            System.out.println("bigDiffTest() is broken");
            return false;
        }
        
        if (!canBalanceTest()){
            System.out.println("bigDiffTest() is broken");
            return false;
        }
        
        
        if (!seriesUpTest()){
            System.out.println("seriesUpTest() is broken");
            return false;
        }
        
        if (!linearInTest()){
            System.out.println("seriesUpTest() is broken");
            return false;
        }
        
        return true;
    }
    
    
    
    public static void main(String args[]){
        PracticeArrays a = new PracticeArrays();
        if(a.practiceArraysUnitTest())
            System.out.println("All is well");
        else System.out.println("errors");
    }
            
}
