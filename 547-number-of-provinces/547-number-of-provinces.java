class Solution {

    public int findCircleNum(int[][] isConnected) {
        ArrayList<HashSet<Integer>> provs = new ArrayList<HashSet<Integer>>();

        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if(isConnected[i][j]==1){
                    boolean found= false;
                    for (HashSet set : provs) {
                        if (set.contains(i) || set.contains(j)) {
                            set.add(i);
                            set.add(j);
                            found = true;
                        }
                    }
                    if(found) continue;;

                    if(!found){
                        HashSet<Integer> set = new HashSet<>();
                        set.add(i);
                        set.add(j);
                        dfs(j,isConnected,set);
                        provs.add(set);
                    }
                }

            }

        }

        return provs.size();
    }


    void dfs(int j ,int[][] isConnected,HashSet<Integer> set){
        for (int i = 0; i < isConnected.length; i++) {
            if(isConnected[j][i]==1&& !set.contains(i)){
                set.add(i);
                dfs(i,isConnected,set);
            }
        }
    }
}