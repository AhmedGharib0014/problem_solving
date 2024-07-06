class Solution {
    public int minCostClimbingStairs(int[] cost) {

       int[] mincost =  new int[cost.length];
 
        mincost[0] = cost[0];
        mincost[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            mincost[i] = Math.min(mincost[i-1],mincost[i-2])+ cost[i];
        }

        return Math.min(mincost[cost.length-1],mincost[cost.length-2]);
    }

    public void calculatePathCost(int[] cost, int currentCost, int index,       ArrayList<Integer> result){

        if (index >= cost.length) {
           result.add(currentCost);
           return;
        }

        calculatePathCost(cost,currentCost + cost[index],index+1,result);
        calculatePathCost(cost,currentCost + cost[index],index+2,result);

    }
}