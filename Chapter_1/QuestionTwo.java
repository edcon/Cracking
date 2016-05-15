public class QuestionTwo {

   public static void main(String[] args) {
     if(isPermutation(args[0], args[1]) == true){
       System.out.println("The strings are permutations");
     }
     else{
       System.out.println("The strings are not permutations");
     }
   }

  public static boolean isPermutation(String s1, String s2){
    int[] array = new int[256];

    for (int i = 0;i < s1.length(); i++){    //Add 1 for each unicode character in string 1
        int c = s1.charAt(i);
        array[c] =  array[c] + 1;
      }


      for (int j = 0; j < s2.length(); j++){  //Check each unicode character in string 2 against the array
        int c2 = s2.charAt(j);
          if (array[c2] == 0){
            return false;
          }
          else if(array[c2] > 1){

            array[c2]--;

          }

        }
    return true;
    }

  }
