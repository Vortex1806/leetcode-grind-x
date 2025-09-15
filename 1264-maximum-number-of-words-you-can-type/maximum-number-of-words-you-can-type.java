class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int wrCnt = 0;
        String[] words = text.split(" ");
        
        for (String word : words) {
        boolean canType = true;
        for (int i = 0; i < word.length(); i++) {
            if (brokenLetters.indexOf(word.charAt(i)) != -1) { 
                canType = false;
                break;
            }
        }
        if (canType) wrCnt++;
    }
        return wrCnt;
    }
}