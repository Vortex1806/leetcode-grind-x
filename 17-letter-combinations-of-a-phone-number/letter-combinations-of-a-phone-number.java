class Solution {
    public void findCombo(Map<Character, String> digitMap, String digits, StringBuilder current, int ind, List<String> ans) {
        if(ind == digits.length()) {
            ans.add(current.toString());
            return;
        }
        String letters = digitMap.get(digits.charAt(ind));
        for(int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            findCombo(digitMap, digits, current, ind+1, ans);
            current.deleteCharAt(current.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        Map<Character, String> digitMap = new HashMap<>();
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");

        findCombo(digitMap, digits, new StringBuilder(), 0, ans);
        return ans;
    }
}