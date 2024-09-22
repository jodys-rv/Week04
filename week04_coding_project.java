package Week04;
public class week04_coding_project {
  public static void main(String[] args) {
    
    //Section 1: Create an array of int called ages:
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    //Print the last element minus the first element:
    System.out.println(ages[ages.length - 1] - ages[0]);
    
    int[] ages2 = {43, 32, 2, 55, 61, 64, 5, 9, 88};
    //This line of code works for an array of any length.
    System.out.println(ages2[ages2.length - 1] - ages2[0]);
    
    
    //Here I calculate the average of both my arrays.
    //Regular for-loop:
    int sum = 0;
    for (int i = 0; i < ages.length; i++) {
      sum += ages[i];
    }
    System.out.println("The average age of group 1 is " + sum/ages.length);
    
    
    //Enhanced for-loop:
    int sum2 = 0;
    for (int age : ages2) {
      sum2 += age;
    }
    System.out.println("The average age of group 2 is " + sum2/ages2.length);
    
    
    //A different way of initializing and populating my array, so you don't get bored.
    String[] names = new String[6];
    names[0] = "Sam";
    names[1] = "Tommy";
    names[2] = "Tim";
    names[3] = "Sally";
    names[4] = "Buck";
    names[5] = "Bob";
    
    /*
     * Note the length of the array is just .length because it's a property,
     *  but the length of an individual word is .length() because it's a method.
     */
    int sum3 = 0;
    for (int i = 0; i < names.length; i++) {
      sum3 = sum3 + names[i].length();
    }
    System.out.println("The average name length is: " + sum3/names.length);
    
    /*
     * String concatenation. If the trailing space at the end of the string mattered,
     * I might have to do it a different way.
     */
    String s = "";
    for (String name : names) {
      s = s + name + " ";
    }
    System.out.println(s);
    
    /*
     * Question 3: the last element of any array is array[array.length - 1]
     * Question 4: The first element of any array is array[0]
     */
    
    // Qs 5 and 6. put the lengths of the names in int array, add them up.
    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }
    int nameSum = 0;
    for (int length : nameLengths) {
      nameSum += length;
    }
    System.out.println(nameSum);
    
    
    
    //testing wordMultiplier method, Q7.
    System.out.println(wordMultiplier("toothbrush", 3));
    
    //testing nameJoiner method, Q8.
    String firstName = "Jody";
    String lastName = "Clements";
    System.out.println(nameJoiner(firstName, lastName));
    
    //testing isLarge method, Q9. Reused arrays from earlier for the test.
    System.out.println(isLarge(ages));
    System.out.println(isLarge(nameLengths));
    
    //testing arrayAverage method, Q10.
    double[] doubleArray = {12.34, 43.45, 38.843, 82.75};
    System.out.println(arrayAverage(doubleArray));
    
    //testing whichIsBigger method, Q11.
    double[] doubleArray2 = {33.77, 83.76, 38.111, 2.5, 5.44};
    System.out.println(whichIsBigger(doubleArray, doubleArray2));
    
    //testing willBuyDrink method, Q12.
    boolean isHotOutside = false;
    double moneyInPocket = 20.00;
    if (willBuyDrink(isHotOutside, moneyInPocket) == true) {
      System.out.println("I'd love some lemonade!");
    } else {
      System.out.println("No thanks.");
    }
    //made a method to determine which number in an array is largest, Q13.
    biggestNumber(ages);
  }
  
  //methods go down here.
  
  /**
   * concatenates a given word to itself n times
   * @param word
   * @param n
   * @return String, multiple of given word.
   */
  public static String wordMultiplier(String word, int n) {
    String wordRep = "";
    for (int i = 0; i < n; i++) {
      wordRep = wordRep + word;
    }
    return wordRep;
  }
  
  /**
   * joins a first name and last name together with a space in between.
   * @param firstName
   * @param lastName
   * @return fullName
   */
   public static String nameJoiner(String firstName, String lastName) {
     return firstName + " " + lastName;
   } 
   
   /**
    * adds the numbers in an array to see if they are greater than 100.
    * @param array
    * @return T if sum > 100, F otherwise.
    */
   public static boolean isLarge(int[] array) {
     int total = 0;
     for (int each : array) {
       total += each;
     }
     if (total > 100) {
       return true;
     } else {
       return false;
     }
   }
   
   /**
    * finds the average of an array of doubles.
    * @param array
    * @return average of array elements
    */
   public static double arrayAverage(double[] array) {
     double sum = 0;
     for (double each : array) {
       sum += each;
     }
     return sum / array.length;
   }

   /**
    * determines whether the average of one array of doubles
    *  is larger than the average of another.
    * @param array
    * @param array2
    * @return T if the first array has a larger average, F for the second.
    */
   public static boolean whichIsBigger(double[] array, double[] array2) {
     double sum = 0;
     double sum2 = 0;
     
     for (double each : array) {
       sum += each;
     }
     for (double each : array2) {
       sum2 += each;
     }
     if (sum/array.length > sum2/array2.length) {
       return true;
     } else {
       return false;
     }
   }
   
   /**
    * determines whether I will buy a drink.
    * @param isHotOutside
    * @param moneyInPocket
    * @return T if isHotOutside is true AND I have more than $10.50.
    */
   public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
     if (isHotOutside == true && moneyInPocket > 10.50) {
       return true;
     } else {
       return false;
     }
   }
   
   /**
    * given an array of numbers, prints out the largest one.
    * @param numbers
    */
   public static void biggestNumber(int[] numbers) {
     int n = numbers[0];
     for (int i = 1; i < numbers.length; i++) {
       if (numbers[i] > n) {
         n = numbers[i];
         
       }
     }
     System.out.println(n);
   
     
   }
   
   
   
   
}
