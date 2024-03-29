class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int low = 1, high = 1000000000, k = 0;
        while (low <= high) {
            k = (low + high) / 2;
            int totalHours = 0;
        //For each piles we have to count time and add them for getting totalHours//

            for (int i = 0; i < piles.length; i ++) 
                totalHours += Math.ceil(1.0 * piles[i] / k);
            if (totalHours > H)
                low = k + 1;
//Means we have to find greater number for this so we search in right to get  Minimum totalHours//
            else
                high = k - 1;// otherwise search in left for that//
        }
        return low;
    }
}