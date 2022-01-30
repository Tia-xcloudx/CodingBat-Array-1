import java.util.*;
import java.awt.*;
import java.lang.Math;

public class CodingBat_Array_1 {
   public static void main(String[] args){
      //Scanner input = new Scanner(System.in);
      int[] testArray = new int[] {1, 2, 1};
      System.out.println (firstLast6(testArray));
      System.out.println (sameFirstLast(testArray));
      int[] arrayPi = new int[3];
      arrayPi = makePi();
      for (int x=0; x<arrayPi.length; x++)
         System.out.print (arrayPi[x]);
      System.out.println();
      int[] testArray2 = new int[] {1, 2, 3};
      int[] testArray3 = new int[] {1,3,7};
      System.out.println (commonEnd(testArray2, testArray3));
      int[] testArray4 = new int[] {1,2,3};
      System.out.println (sum3(testArray4));
      int[] testArray5 = new int[] {1, 2, 3};
      int[] rotar = new int[testArray5.length];
      rotar = rotateLeft3(testArray5);
      for (int x=0; x<rotar.length; x++)
         System.out.print(rotar[x]);
      System.out.println();
      int[] testArray6 = new int[] {1,2,3};
      int[] revar = new int[testArray6.length];
      revar = reverse3(testArray6);
      for (int x=0; x<revar.length; x++)
         System.out.print(revar[x]);
      System.out.println();
      int[] testArray7 = new int[] {1,2,3};
      int[] maxar = new int[testArray7.length];
      maxar = maxEnd3(testArray7);
      for (int x=0; x<maxar.length; x++)
         System.out.print(maxar[x]);
      System.out.println();
      int[] testArray8 = new int[] {4,3};
      System.out.println (has23(testArray8));
      System.out.println();
      int[] testArray9 = new int[] {4,2,1};
      int[] testArray10 = new int[] {4,5,9};
      int[] testArray11 = new int[2];
      testArray11 = middleWay(testArray9, testArray10);
      System.out.print("[");
      for (int i =0 ; i <testArray11.length ; i++)
         if (i == testArray11.length-1)
            System.out.print(testArray11[i]);
         else
            System.out.print(testArray11[i] + ",");
      System.out.println("]");
      int[] testArray12 = new int[] {7, 4, 6, 2};
      int[] testArray13 = new int[2];
      testArray13 = makeEnds(testArray12);
      System.out.print("[");
      for (int i =0 ; i <testArray13.length ; i++)
         if (i == testArray13.length-1)
            System.out.print(testArray13[i]);
         else
            System.out.print(testArray13[i] + ",");
      System.out.println("]");
      int[] testArray14 = new int[] {3,5};
      System.out.println (no23(testArray14));
      System.out.println();
      int[] testArray15 = new int[] {4, 5, 6};
      int[] testArray16 = new int[testArray15.length*2];
      testArray16 = makeLast(testArray15);
      System.out.print("[");
      for (int i =0 ; i <testArray16.length ; i++)
         if (i == testArray16.length-1)
            System.out.print(testArray16[i]);
         else
            System.out.print(testArray16[i] + ",");
      System.out.println("]");
      int[] testArray17 = new int[] {2,3};
      System.out.println (double23(testArray17));
      int[] testArray18 = new int[] {1,2,1};
      int[] testArray19 = new int[3];
      testArray19 = fix23(testArray18);
      System.out.print("[");
      for (int i =0 ; i <testArray19.length ; i++)
         if (i == testArray19.length-1)
            System.out.print(testArray19[i]);
         else
            System.out.print(testArray19[i] + ",");
      System.out.println("]");
      int[] testArray20 = new int[] {1, 2, 3};
      int[] testArray21 = new int[] {1, 3};
      System.out.println (start1(testArray20, testArray21));
      int[] testArray22 = new int[] {1,2};
      int[] testArray23 = new int[] {3,4};
      int[] testArray24 = new int[2];
      testArray24 = biggerTwo(testArray22,testArray23);
      System.out.print("[");
      for (int i =0 ; i <testArray24.length ; i++)
         if (i == testArray24.length-1)
            System.out.print(testArray24[i]);
         else
            System.out.print(testArray24[i] + ",");
      System.out.println("]");
      int[] testArray25 = new int[] {7, 1, 2, 3, 4, 9};
      int[] testArray26 = new int[2];
      testArray26 = makeMiddle(testArray25);
      System.out.print("[");
      for (int i =0 ; i <testArray26.length ; i++)
         if (i == testArray26.length-1)
            System.out.print(testArray26[i]);
         else
            System.out.print(testArray26[i] + ",");
      System.out.println("]");
      int[] testArray27 = new int[] {1, 2, 3, 4};
      int[] testArray28 = new int[] {5, 6, 7, 8, 9};
      int[] testArray29 = new int[testArray27.length + testArray28.length];
      testArray29 = plusTwo(testArray27,testArray28);
      System.out.print("[");
      for (int i =0 ; i <testArray29.length ; i++)
         if (i == testArray29.length-1)
            System.out.print(testArray29[i]);
         else
            System.out.print(testArray29[i] + ",");
      System.out.println("]");
      int[] testArray30 = new int[] {8, 6, 7, 9, 5};
      int[] testArray31 = new int[testArray30.length];
      testArray31 = swapEnds(testArray30);
      System.out.print("[");
      for (int i =0 ; i <testArray31.length ; i++)
         if (i == testArray31.length-1)
            System.out.print(testArray31[i]);
         else
            System.out.print(testArray31[i] + ",");
      System.out.println("]");
      int[] testArray32 = new int[] {8, 6, 7, 5, 3, 0, 9};
      int[] testArray33 = new int[testArray32.length];
      testArray33 = midThree(testArray32);
      System.out.print("[");
      for (int i =0; i <testArray33.length; i++)
         if (i == testArray33.length-1)
            System.out.print(testArray33[i]);
         else
            System.out.print(testArray33[i] + ",");
      System.out.println("]");
      int[] testArray34 = new int[] {5, 2, 3};
      System.out.println("The largest of the three (first, middle, last in the array) is: " + maxTriple(testArray34));
      int[] testArray35 = new int[] {1, 2, 3};
      int[] testArray36 = new int[2];
      testArray36 = frontPiece(testArray35);
      System.out.print("[");
      for (int i =0; i <testArray36.length; i++)
         if (i == testArray36.length-1)
            System.out.print(testArray36[i]);
         else
            System.out.print(testArray36[i] + ",");
      System.out.println("]");
      int[] testArray37 = new int[] {2, 5, 3, 1, 3};
      System.out.println("Is testArray37 unlucky? " + unlucky1(testArray37));
      int[] testArray38 = new int[] {4, 5};
      int[] testArray39 = new int[] {1, 2, 3};
      int[] testArray40 = new int[2];
      testArray40 = make2(testArray38,testArray39);
      System.out.print("[");
      for (int i =0; i <testArray40.length; i++)
         if (i == testArray40.length-1)
            System.out.print(testArray40[i]);
         else
            System.out.print(testArray40[i] + ",");
      System.out.println("]");
      int[] testArray41 = new int[] {1,7};
      int[] testArray42 = new int[] {};
      int x;
      if (testArray41.length == 0 || testArray42.length == 0)
         x = 1;
      else
         x = 2;
      int[] testArray43 = new int[x];
      testArray43 = front11(testArray41,testArray42);
      System.out.print("[");
      for (int i =0; i <testArray43.length; i++)
         if (i == testArray43.length-1)
            System.out.print(testArray43[i]);
         else
            System.out.print(testArray43[i] + ",");
      System.out.println("]");
      
      


      

//      int[] inputInt = new int[5];
//      int s = 0;
//      int p = 1;
//      for (int x = 0; x < inputInt.length; x++)
//         {
//            System.out.print("Enter random integer for array element [" + x +"]: ");
//            inputInt[x] = input.nextInt();
//         }
      
//      for (int x = 0; x < inputInt.length; x++)
//         {
//            System.out.println("Element inputInt["+x+"] is "+inputInt[x]);
//            s = s + inputInt[x];
//            p = p * inputInt[x];
            
//         }
//      System.out.println("The sum of all elements in the array is: "+s);
//      System.out.println("The product of all elements in the array is: "+p);

         
   }      

   public static boolean firstLast6(int[] nums) {
      if (nums[0] == 6 || nums[nums.length-1] == 6)
         return true;
      else
         return false;
   }
   
   public static boolean sameFirstLast(int[] nums) {
      if ((nums.length >= 1) && (nums[0]==nums[nums.length-1])){
            return true;
         }
         else{ 
            return false;
         }
   }
   
   public static int[] makePi() {
      int[] piArray = new int[] {3, 1, 4};
      return piArray;
   }
   
   public static boolean commonEnd(int[] a, int[] b) {
      if ((a[0] == b[0]) || (a[a.length-1] == b[b.length-1])){
            return true;
         }
         else{ 
            return false;
         }
   }
   
   public static int sum3(int[] nums) {
      int x = 0;
      for (int y=0; y<nums.length; y++){
         x = x+nums[y];
      }
      return x;
   }
   
   public static int[] rotateLeft3(int[] nums){
      int[] newAr = new int[nums.length];
      for (int x = 0; x<nums.length; x++){
         if (x==0){
               newAr[nums.length-1]=nums[x];
            }
            else{ 
               newAr[x-1]=nums[x];
            }  
      }
      return newAr;
  }
  
  public static int[] reverse3(int[] nums){
      int[] newAr = new int[nums.length];
      for (int x = 0; x<nums.length; x++){
         newAr[nums.length-1-x]=nums[x];
            }  
      return newAr;
  }
  
  public static int[] maxEnd3(int[] nums){
      int[] newAr = new int[nums.length];
      if (nums[0] > nums[nums.length-1])
         for (int x=0; x<nums.length; x++){
            newAr[x] = nums[0];
      } 
      else
         for (int x=0; x<nums.length; x++){
            newAr[x] = nums[nums.length-1];
            
      }
      return newAr;
     }
     
  public static boolean has23(int[] nums){
   //if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3){
   //boolean x=true; 
   for (int i = 0; i <nums.length; i++){
      if (nums[i] == 2 || nums[i] == 3){
         return true;
      }
   }
   return false;
  }
  
  public static int[] middleWay(int[] a, int[] b){
      int[] newAr = new int[2];
      newAr[0] = a[1];
      newAr[1] = b[1];
      return newAr;
     }
     
  public static int[] makeEnds(int[] nums){
      int[] newAr = new int[2];
      newAr[0] = nums[0];
      newAr[1] = nums[nums.length-1];
      return newAr;
     }
     
  public static boolean no23(int[] nums){ 
   for (int i = 0; i <nums.length; i++){
      if (nums[i] == 2 || nums[i] == 3){
         return false;
      }
   }
   return true;
  }
  
  public static int[] makeLast(int[] nums){
      int[] newAr = new int[nums.length*2];
      newAr[newAr.length-1] = nums[nums.length-1];
      return newAr;
  }
  
  public static boolean double23(int[] nums){ 
      if ((nums[0]== 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)){
         return true;
      }
   return false;
  }
  
  public static int[] fix23(int[] nums){
      for (int i = 0; i<nums.length-1; i++){
         if (nums[i] == 2){
            if (nums[i+1] == 3)
               nums[i+1] = 0;
         }
      }  
      return nums;
  }
  
  public static int start1(int[] a, int[] b) {
      int counter = 0;
      if (a[0] == 1)
         counter++;
      if (b[0] == 1)
         counter++;
      return counter;
   }
   
   public static int[] biggerTwo(int[] a, int[] b){
   int sumA = 0;
   int sumB = 0; 
   for (int i = 0; i <a.length; i++){
      sumA = sumA + a[i];
      sumB = sumB + b[i];
   }
   if (sumA > sumB)
      return a;
   else if (sumB > sumA)
      return b;
   else
      return a;  
   }
   
   public static int[] makeMiddle(int[] nums){
      int[] newAr = new int[2];
      //newAr[0] = nums[nums.length/2-1];
      //newAr[1] = nums[nums.length/2];
      for (int i =0; i <newAr.length; i++)
         newAr[i] = nums[nums.length/2-1+i];
      return newAr;
  }
  
  public static int[] plusTwo(int[] a, int[] b){
   int[] newAr = new int[a.length+b.length];
   for (int i = 0; i <a.length; i++)
      newAr[i] = a[i];
   for (int i = 0; i <b.length; i++)
      newAr[a.length+i] = b[i];
      
   return newAr; 
   }
   
   public static int[] swapEnds(int[] nums){
      int x = nums[0];
      int y= nums[nums.length-1];
      
      //using a different way to solve it using a loop
      int[] newAr = new int[nums.length];
      nums[0] = y;
      nums[nums.length-1] = x;
      newAr[0] = nums[nums.length-1];
      newAr[newAr.length-1] = nums[0];
      for (int i = 1; i <nums.length-1; i++)
         newAr[i] = nums[i];
      //return newAr;
      //using variables to swap first and last
      nums[0] = y;
      nums[nums.length-1] = x;
      return nums;
     }
     
     public static int[] midThree(int[] nums){
      int[] newAr = new int[3];
      newAr[0] = nums[nums.length/2-1];
      newAr[1] = nums[nums.length/2];
      newAr[2] = nums[nums.length/2+1];
      return newAr;
  }
  
  public static int maxTriple(int[] nums){
   int A = nums[0];
   int B = nums[nums.length/2];
   int C = nums[nums.length-1];
   if (A > B)
      if (A > C)
         return A;
      else
         return C;
   else 
      if (B > C)
         return B;
      else
         return C;
  }
  
  public static int[] frontPiece(int[] nums){
      int[] newAr = new int[2];
      if (nums.length < 2)
         return nums;
      else
         newAr[0] = nums[0];
         newAr[1] = nums[1];
         return newAr;
  }
  
  public static boolean unlucky1(int[] nums){ 
      if ((nums[0]== 1 && nums[1] == 3) || (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)){
         return true;
      }
   return false;
  }
  
  public static int[] make2(int[] a, int[] b){
      int[] newAr = new int[2];
      if (a.length > 1){
         newAr[0] = a[0];
         newAr[1] = a[1];
      }
      else 
         if (a.length == 1){
            newAr[0] = a[0];
            newAr[1] = b[0];
         }
         else{
            newAr[0] = b[0];
            newAr[1] = b[1];
         }
      return newAr;
   }
   
   public static int[] front11(int[] a, int[] b){
      //int[] newAr = new int[2];
      int x;
      if (a.length == 0 || b.length == 0)
         x = 1;
      else
         x=2;
      int[] newAr = new int[x];
      if (a.length == 0){
         newAr[0] = b[0];
      }
      else 
         if (b.length == 0){
            newAr[0] = a[0];
         }
         else{
            newAr[0] = a[0];
            newAr[1] = b[0];
         }
      return newAr;
   }
  
  
  
  
 
     
     
     
     
     
     
     
     
}
       