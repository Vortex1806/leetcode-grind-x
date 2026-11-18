class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int left = 0;
        int best = 0;
        for(int right = 0; right < fruits.length; right++) {
            mpp.put(fruits[right], mpp.getOrDefault(fruits[right], 0) + 1);
            while(mpp.size() > 2) {
                mpp.put(fruits[left], mpp.get(fruits[left]) - 1);
                if(mpp.get(fruits[left]) == 0) {
                    mpp.remove(fruits[left]);
                }
                left++;
            }
            best = Math.max(best, right-left+1);
        }
        return best;

    }
}