class Solution {
    public int totalFruit(int[] fruits) {
        int a = -1;
        int b = -1;
        int aind = -1;
        int bind = -1;
        int left = 0;
        int best = 0;
        for(int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            if(fruit == a) {
                aind = right;
            } else if(fruit == b) {
                bind = right;
            } else {
                if(aind < bind) {
                    left = aind + 1;
                    aind = right;
                    a = fruit;
                } else {
                    left = bind  + 1;
                    bind = right;
                    b = fruit;
                }
            }
            best = Math.max(best, right-left+1);
        }
        return best;

    }
}