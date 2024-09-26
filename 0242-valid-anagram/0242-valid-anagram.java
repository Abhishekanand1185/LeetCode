class Solution {
    public boolean isAnagram(String s, String t) {
        char CharS[] = s.toCharArray();
        char CharT[] = t.toCharArray();

        Arrays.sort(CharS);
        Arrays.sort(CharT);

        return Arrays.equals(CharS,CharT);
    }
}