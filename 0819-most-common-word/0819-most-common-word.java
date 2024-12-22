class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String words[] = str.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        for(String word : words){
            if(word.length() > 0){
                hm.put(word, hm.getOrDefault(word, 0)+1);
            }
        }
        for(String ban : banned){
            if(hm.containsKey(ban)){
                hm.remove(ban);
            }
        }
        String ans = "";
        int max = 0;
        for(String word : hm.keySet()){
            int count = hm.get(word);
            if(count > max){
                max = count;
                ans = word;
            }
        }
    return ans;
    }
}