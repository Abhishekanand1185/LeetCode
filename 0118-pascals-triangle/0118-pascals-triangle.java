class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>();
         return helper(numRows, ans);

    }

    static List<List<Integer>> helper(int numRows, List<List<Integer>> ans ) {
      if(numRows == 1){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        ans.add(list);
        return ans;
      }

      helper(numRows-1, ans);

      List<Integer> list2 = ans.get(numRows-2);
      List<Integer> list3 = new ArrayList<>();
      for(int i = 0; i<numRows; i++){
        if(i == 0 || i == numRows - 1){
           list3.add(1);
           continue;
        }
        int sum = list2.get(i)+list2.get(i-1);
        list3.add(sum);
      }
      ans.add(list3);
      return ans;
    }
}