 GenerateAllPermutations class has the below public method which returns set of all the permutation of given string
     public Set<String> getAllPermutations(String s)

 I am returning the set of all  permutations. I used a set to have all the distinct permutated string only.
    Ex: if string is 'AAA' then set will contain only one ordered String which would be 'AAA'     

Internally above method is using below method
   private synchronized void permutations(char[] s, int startIndex, int lenght)
   
I have made this method synchronized because I am swapping characters to generate the permutation so if this method is not synchronized, will give wrong permutations in the case of multithreading.     


GeneratePemutationsTest class contains all the JUnit test cases to test the functionality of above method. 

 test case 1: testPermutation - if given string contains n distinct  characters, returned set will have n! String
 
 test case 2: testDuplicate - this test case is used to check duplication if given string contains multiple same characters
 
 test case 3 : testNullString - this test case is used to check permutations for the null string.   

Algorithm Paradigm: Backtracking
Time Complexity: O(n*n!) Note that there are n! permutations and it requires O(n) time to print  a permutation.
Space Complexity : O(n!)


