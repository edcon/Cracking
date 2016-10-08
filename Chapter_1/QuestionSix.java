public class QuestionSix{

    public static void main(String[] args){
        String inputString = args[0];
        String out = bobTheBuilder(inputString);
        System.out.println(out);
    }

    public static String bobTheBuilder(String input){
        int count = 0;
        StringBuilder output = new StringBuilder();
        for(int i=0;i<input.length();i++){
            count++;
            if( i+1 >= input.length() || input.charAt(i) != input.charAt(i+1)){
                output.append(input.charAt(i));
                output.append(count);
                count = 0;
            } 
        }
    String out = "";
    if(output.length() > input.length()){
        out = input;
    } else{
        out = output.toString();
    }
    return out;
    }

}