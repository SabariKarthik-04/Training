class Solution {
    public boolean isPalindrome(int x) {
        String inputInString = Integer.toString(x);
        String reversed = inputInString.chars()
                            .mapToObj(c -> (char)c)
                            .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
        if(inputInString.equals(reversed)){
            return true;
        }
        return false;
    }
}