class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int divScore[] = new int[divisors.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int idx = 0;
        for(int div: divisors){
            int temp = div;
            int score = 0;
            for(int num : nums){
                if(num%temp == 0){
                    score++;
                }
            }
            divScore[idx] = score;
            idx++;
            hm.put(temp, score);   
        }
        int max = Integer.MIN_VALUE;
        for(int divS : divScore){
            max = Math.max(max, divS);
        }
        Arrays.sort(divisors);
        for(int i = 0; i<divisors.length; i++){
            if(hm.get(divisors[i]) == max){
                return divisors[i];
            }
        }
    return 0;
    }
}