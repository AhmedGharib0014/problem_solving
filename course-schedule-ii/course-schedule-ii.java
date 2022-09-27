class Solution {
    enum CourseNodeStatus {not_visited,visited,processing}

    class CourseNode{
        int val ;
        CourseNodeStatus visited;

        List<CourseNode> prerequisites = new ArrayList<>();

        public CourseNode(int val) {
            this.val = val;
            this.visited = CourseNodeStatus.not_visited;
        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer,CourseNode> map = new HashMap<>();
        int[] ans = new int[numCourses];
        int [] index=new int[1];
        index[0]=numCourses-1;

        for (int i = 0; i < numCourses; i++) {
            map.put(i,new CourseNode(i));
        }

        for(int[] prerequisite : prerequisites){
            map.get(prerequisite[1]).prerequisites.add(map.get(prerequisite[0]));
        }


        for (CourseNode node : map.values()){
            if(node.visited==CourseNodeStatus.not_visited){
                if(containsCycles(node,ans,index)) {
                    int[] ans1= new int[]{};
                    return ans1;

                }

            }
        }

        return ans;

    }


    public  boolean containsCycles(CourseNode node,int [] ans , int[] index){
        if(node.visited == CourseNodeStatus.visited) return false;
        else  if(node.visited == CourseNodeStatus.processing) return true;
        node.visited=CourseNodeStatus.processing;
        for(CourseNode subNode : node.prerequisites){
            if(containsCycles(subNode,ans,index)) return true;
        }
        node.visited=CourseNodeStatus.visited;
        ans[index[0]]= node.val;
        index[0]= index[0]-1;
        return false;
    }


}