public class QuestionFour{

    public static void main (String[] args){
        int[] uniArray = getUniArray(args[0]);
        //printUniValues(uniArray);

        if(isPalindrome(uniArray)){
            System.out.println("\n True \n");
        } else {
            System.out.println("\n False \n");
        }

    }

    public static int[] getUniArray(String inputString){
        int[] uniArray = new int[256];
        for(int i = 0; i < inputString.length(); i++){
          int c = inputString.charAt(i);
          if(c > 64 && c < 91){
            c = c + 32;             //make any capital letters lowercase
          }
          uniArray[c]++;
        }
        return uniArray;
    }

    public static void printUniValues(int[] uni){
        System.out.println("---------------");
        for(int i = 0; i<256; i++){
            if(uni[i] != 0){
                char c = (char)i;
                System.out.println("   " + i + "   " + c + "   " + uni[i]);
            }
        }
        System.out.println("-----------");

    }

    public static boolean isPalindrome(int[] uniArray){
        int oddCount = 0;
        for(int i = 0; i<256; i++){
                if(uniArray[i] != 0){
                    if(uniArray[i] % 2 == 1 && i != 32)    //if odd and not a space
                        oddCount++;                        //increment odd count
                        if(oddCount > 1){
                           return false;                   //if more than one odd char return false
                        }
                }
        }
        return true;
    }
}