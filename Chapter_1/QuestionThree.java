public class QuestionThree {

   public static void main(String[] args) {

     String s = "E d w a r d c o n d o n";
     int slen = s.length();
     char[] array = new char[slen*4];   //create char array with room to expand

      for (int a = 0;a < slen; a++){    //move string into char array
        array[a] = s.charAt(a);
      }

     for (int i = 0;i < slen; i++){
       if (array[i] == ' ' ){ //if current char is a space
         int ss = slen -1;

         for(int j = ss; j > i; j--){   //move every char after space over 2 spots
           array[j+2] = array[j];
         }
         array[i] = '%';
         array[i+1] = '2';
         array[i+2] = '0';
         slen = slen + 2;
       }
     }
     String url = String.valueOf(array);
     System.out.println(url);
   }
}
