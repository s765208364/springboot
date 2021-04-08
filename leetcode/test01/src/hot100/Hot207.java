package hot100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Hot207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        List<List<Integer>> adjacency = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++)
            adjacency.add(new ArrayList<>());

        for(int[] cp:prerequisites){
            indegrees[cp[0]]++;
            adjacency.get(cp[0]).add(cp[0]);
        }
        for(int i=0;i<numCourses;i++)
            if(indegrees[i] ==0 )queue.add(i);

        while(!queue.isEmpty()){
            int pre = queue.poll();
            numCourses--;
            for(int cur:adjacency.get(pre))
                if(--indegrees[cur]==0)queue.add(cur);
        }
        return numCourses == 0;
    }
}
