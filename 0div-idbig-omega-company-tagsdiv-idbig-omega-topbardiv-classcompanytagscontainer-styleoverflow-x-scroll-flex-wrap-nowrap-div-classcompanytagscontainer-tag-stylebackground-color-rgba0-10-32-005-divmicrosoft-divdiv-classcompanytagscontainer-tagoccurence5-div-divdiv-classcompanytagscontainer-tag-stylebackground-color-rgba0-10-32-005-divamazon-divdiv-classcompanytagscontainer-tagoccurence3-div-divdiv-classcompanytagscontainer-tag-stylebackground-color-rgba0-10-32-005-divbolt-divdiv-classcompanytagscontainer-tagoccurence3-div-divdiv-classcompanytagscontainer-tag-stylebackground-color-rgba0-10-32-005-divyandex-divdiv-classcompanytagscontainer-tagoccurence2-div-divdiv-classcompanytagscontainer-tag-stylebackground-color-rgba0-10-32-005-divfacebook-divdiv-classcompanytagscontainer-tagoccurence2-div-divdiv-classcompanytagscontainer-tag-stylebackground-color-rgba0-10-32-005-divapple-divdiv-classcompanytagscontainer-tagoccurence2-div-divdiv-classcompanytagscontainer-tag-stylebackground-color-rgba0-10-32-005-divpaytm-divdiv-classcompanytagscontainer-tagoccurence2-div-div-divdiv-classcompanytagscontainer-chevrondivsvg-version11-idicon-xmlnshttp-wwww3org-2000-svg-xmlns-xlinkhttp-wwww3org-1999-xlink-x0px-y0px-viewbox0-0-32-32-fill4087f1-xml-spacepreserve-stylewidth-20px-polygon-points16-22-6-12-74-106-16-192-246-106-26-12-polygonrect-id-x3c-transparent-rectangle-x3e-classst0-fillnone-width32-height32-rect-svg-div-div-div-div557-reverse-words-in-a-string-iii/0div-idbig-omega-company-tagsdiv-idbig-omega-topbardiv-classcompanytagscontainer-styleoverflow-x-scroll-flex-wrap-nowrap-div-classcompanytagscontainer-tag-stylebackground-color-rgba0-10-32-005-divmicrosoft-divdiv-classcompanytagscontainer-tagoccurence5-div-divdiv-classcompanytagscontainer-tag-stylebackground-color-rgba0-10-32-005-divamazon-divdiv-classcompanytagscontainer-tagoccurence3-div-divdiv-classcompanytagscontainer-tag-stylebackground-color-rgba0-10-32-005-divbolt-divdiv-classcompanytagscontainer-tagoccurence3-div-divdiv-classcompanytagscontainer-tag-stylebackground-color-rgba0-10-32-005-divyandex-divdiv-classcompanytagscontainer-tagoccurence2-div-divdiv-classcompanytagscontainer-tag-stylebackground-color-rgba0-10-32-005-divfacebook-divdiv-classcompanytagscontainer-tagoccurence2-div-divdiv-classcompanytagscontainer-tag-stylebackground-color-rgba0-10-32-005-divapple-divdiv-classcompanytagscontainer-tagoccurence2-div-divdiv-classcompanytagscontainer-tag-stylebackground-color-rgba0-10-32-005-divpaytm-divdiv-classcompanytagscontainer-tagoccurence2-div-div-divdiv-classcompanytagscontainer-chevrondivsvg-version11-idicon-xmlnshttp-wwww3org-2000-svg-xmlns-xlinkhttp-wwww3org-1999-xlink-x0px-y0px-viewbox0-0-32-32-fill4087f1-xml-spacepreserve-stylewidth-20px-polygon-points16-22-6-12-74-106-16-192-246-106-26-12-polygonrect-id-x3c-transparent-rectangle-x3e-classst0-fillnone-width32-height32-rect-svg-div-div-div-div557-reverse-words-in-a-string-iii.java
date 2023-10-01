class Solution {
    public String reverseWords(String input) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {

            if(input.charAt(i) != ' '){
                temp.append(input.charAt(i));
            }
            else{
                sb.append(temp.reverse());
                sb.append(" ");
                temp = new StringBuilder();
            }
            
        }
        sb.append(temp.reverse());
        // sb.reverse();
        return sb.toString();
        
    }
}