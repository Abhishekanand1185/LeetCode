class Solution {
    public String addSpaces(String s, int[] spaces) {
         StringBuilder sb = new StringBuilder();
         int st = 0;
         for(int i : spaces){
            sb.append(s.substring(st, i)).append(" ");
            st = i;
         }
         sb.append(s.substring(st));
    return new String(sb);
    }
}