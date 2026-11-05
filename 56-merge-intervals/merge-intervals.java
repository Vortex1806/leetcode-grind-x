class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] sorted = intervals.clone();
        Arrays.sort(sorted, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int[] cur = sorted[0].clone();
        for(int i = 1; i < sorted.length; i++) {
            if(sorted[i][0] >= cur[0] && sorted[i][0] <= cur[1]) {
                cur[1] = Math.max(cur[1], sorted[i][1]);
            } else {
                res.add(cur);
                cur = sorted[i].clone();
            }
        }
        res.add(cur);
        return res.toArray(new int[0][]);
    }
}