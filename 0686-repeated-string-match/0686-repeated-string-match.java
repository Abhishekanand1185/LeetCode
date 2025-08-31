class Solution {
    public int repeatedStringMatch(String a, String b) {
        if(a.contains(b)){
            return 1;
        }
        StringBuilder repA = new StringBuilder(a);
        int count = 1;
        while(repA.length() < b.length()){
            repA.append(a);
            count++;
            if(repA.toString().contains(b)){
                return count;
            }
        }
        repA.append(a);
        count++;
        if(repA.toString().contains(b)){
            return count;
        }
    return -1;
    }
}