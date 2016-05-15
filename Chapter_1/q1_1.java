import java.util.Scanner;

public class unique {
   public static void main(String[] args) {
     input();


     }
public static void input(){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a string, bro: ");
  String s = input.next();

   if(isUnique(s) == true){
     System.out.println("All characters are unique.");
   }
   else{
     System.out.println("There is a duplicate character.");
   }
  input();
}
     public static boolean isUnique(String ex){
       boolean[] array = new boolean[128];  //initializes Boolean Array to all False
       for (int i = 0;i < ex.length(); i++){
         int c = ex.charAt(i);
         if (array[c] == true){
           return false;
         }
         else{
        array[c] = true;
         }
        // System.out.println(c);
       }
    return true;
   }
}
