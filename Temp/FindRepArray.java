class FindRepArray{
    
    public int findRepArray(int[] input1, int input2){
    Set<Integer> set = new HashSet<>();

    int n = input1.length;
    int ans = input1[n-1];
    int zCnt = 0;
    for(int i = n-1; i >= 0; i--){
        if(input1[i] <= 0)
        zCnt++;

        if(input1[i] > 0 && set.contains(input1[i])) {
            ans = input1[i];
            break;
        }
        else{
            set.add(input1[i]);
        }
    }

    if(zCnt == n) return 0;

    return ans;
    }

public static void main(String[] args) {
    int[] arr = new int[]{15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
    //System.out.println(findStringWeight(arr , "Wipro Limited"));

    int[] curr = {1,1,1,0,1,1,1,1};
    int[] ans = streetLight(curr, 2);
    for(int l = 0; l < ans.length; l++)
    System.out.print(ans[l]+" ");
}
public static int findStringWeight(int[] input1, String input2){
    input2 = input2.toLowerCase();
    String[] arr = input2.split(" ");

    int ans = 1;

    for(String s : arr){
        int n = s.length();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int ch = (s.charAt(i)-'a');
            if(i == 0 && input1[ch] < 0){
                sum += ch+1;
            }

            if(i == n-1 && input1[ch] < 0){
                sum += ch+1;
            }

            sum += input1[ch];
        }
        ans *= sum;
    }

    return ans;

}

public static int[] streetLight(int[] currentState, int days){
    int n = currentState.length;
    int[] ans = new int[n];
    for(int d = 0; d < days; d++){
        for(int i = 0; i < n; i++){
            if(i == 0){
                ans[i] = currentState[i+1]^0;
            }
            else if(i == n-1){
                ans[i] = currentState[i-1]^0;
            }
            else{
                ans[i] = currentState[i-1]^currentState[i+1];
            }
        }
        currentState = ans.clone();
    }
    return ans;
    }

    public static int palindromeArray(int[] arr, int)
}