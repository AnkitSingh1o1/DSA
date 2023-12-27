class Hello{
    public static void main(String[] args){
            String name = "Vyom", goodString = "(@HR*i{kcQl";
                int[][] dp = new int[name.length()][goodString.length()];
                
                for (int i = 0; i < name.length(); i++) {
                    for (int j = 0; j < goodString.length(); j++) {
                        if (name.charAt(i) == goodString.charAt(j)) {
                            dp[i][j] = 0;
                        } else {
                            dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + 1;
                        }
                    }
                }
                
                System.out.print(dp[name.length() - 1][goodString.length() - 1]);
        }
    }