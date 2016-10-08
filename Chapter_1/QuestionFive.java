public class QuestionFive{
    public static void main(String[] args){
        String string1 = args[0];
        String string2 = args[1];
        if(oneEdit(string1, string2)){
            System.out.println("\nTrue\n");
        }else{
            System.out.println("\nFalse\n");
        }

    }

    public static boolean oneEdit(String str1, String str2){
        if(str1.length() == str2.length()){
            return replaceChar(str1,str2);
        } else if(str1.length() + 1 == str2.length()){
            return insertChar(str1, str2);
        } else if(str1.length() - 1 == str2.length()){
            return insertChar(str2, str1);
        }else {
            return false;
        }

    }

    public static boolean replaceChar(String s1, String s2){
        boolean diff = false;
        for(int i = 0;i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(diff == true){
                    return false;
                } else{
                    diff = true;
                }
            }
        }
    return true;
    }

    public static boolean insertChar(String small, String large){
        boolean diff = false;
        int index1 = 0;
        int index2 = 0;

        while(index1 < small.length() && index2 < large.length()){
            if(small.charAt(index1) != large.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            } else{
                index1++;
                index2++;
            }
        }
        return true;
    }

}