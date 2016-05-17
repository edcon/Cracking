public class QThreeAttTwo {
//Question Three attempt Two

   public static void main(String[] args) {

     String s = "Mr John Smith";
     int slen = s.length();
     char[] ca = new char[slen*4];   //create char array with room to expand

      for (int a = 0;a < slen; a++){    //move string into char array
        ca[a] = s.charAt(a);
      }

     spaceReplace(ca, slen);
}

static void spaceReplace(char[] carr, int length){
       int spaces = 0,i;
       for (i = 0;i < length; i++){
         if(carr[i] == ' '){
           spaces++;
         }
       }


    int newLength = length + spaces*2;
     carr[newLength] = '\0';
     for(i = length - 1; i >= 0; i--){
       if(carr[i] == ' '){
         carr[newLength - 1] = '0';
         carr[newLength - 2] = '2';
         carr[newLength - 3] = '%';
         newLength = newLength - 3;
       } else {
         carr[newLength - 1] = carr[i];
         newLength--;
       }

     }
     String url = String.valueOf(carr);
     System.out.println(url);

   }
}
