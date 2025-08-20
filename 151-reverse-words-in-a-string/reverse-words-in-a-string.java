class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim spaces and convert to char array
        char[] chars = s.toCharArray();
        int n = chars.length;

        // Step 2: Remove extra spaces
        int i = 0, j = 0;
        while (j < n) {
            // Skip multiple spaces
            while (j < n && chars[j] == ' ') j++;
            // Copy non-space characters
            while (j < n && chars[j] != ' ') chars[i++] = chars[j++];
            // Skip spaces between words
            while (j < n && chars[j] == ' ') j++;
            if (j < n) chars[i++] = ' '; // keep one space
        }

        // Now i is the new length
        String cleaned = new String(chars, 0, i);

        // Step 3: Reverse the whole string
        char[] arr = cleaned.toCharArray();
        reverse(arr, 0, arr.length - 1);

        // Step 4: Reverse each word individually
        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr);
    }
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}