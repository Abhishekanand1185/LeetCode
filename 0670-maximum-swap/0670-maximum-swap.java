class Solution {
    public int maximumSwap(int num) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int temp = num;
        int count = 0;
        while(temp != 0){
            int r = temp%10;
            temp /=10;
            pq.add(r);
            count++;
        }
        int arr[] = new int[count];
        int temp2 = num;
        for(int i=arr.length-1; i>=0; i--){
            int r = temp2%10;
            arr[i] = r;
            temp2/=10;
        }
        int temp3=0;
        int j=0;
        int f=0;
        for(int i=0; i<arr.length; i++){
            f++;
            temp3=pq.poll();
            if(temp3 != arr[i]){
                j=i;
                break;
            }
        }
        if(f<arr.length){
        System.out.println("j="+j);
        int indexI=0;
        for(int i=j+1; i<arr.length; i++){
            if(arr[i]==temp3){
                 indexI=i;
            }
        }
        System.out.println("i="+indexI);
        int temp4 = arr[j];
        arr[j] = temp3;
        arr[indexI] = temp4;
        }
        
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans*10+arr[i];
        }
        return ans;
    }
}