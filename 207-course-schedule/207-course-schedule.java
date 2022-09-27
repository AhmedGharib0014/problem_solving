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
    
     public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,CourseNode> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i,new CourseNode(i));
        }

        for(int[] prerequisite : prerequisites){
            map.get(prerequisite[1]).prerequisites.add(map.get(prerequisite[0]));
        }


        for (CourseNode node : map.values()){
            if(node.visited==CourseNodeStatus.not_visited){
                if(containsCycles(node)) return false;

            }
        }

        return true;

    }


    public  boolean containsCycles(CourseNode node){
        if(node.visited == CourseNodeStatus.visited) return false;
        else  if(node.visited == CourseNodeStatus.processing) return true;
        node.visited=CourseNodeStatus.processing;
        for(CourseNode subNode : node.prerequisites){
            if(containsCycles(subNode)) return true;
        }
        node.visited=CourseNodeStatus.visited;
        return false;
    }

   
}