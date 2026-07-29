class Solution {
    public int numRabbits(int[] answers) {
        Map <Integer, Integer> count = new HashMap<>();
        for(int a: answers)
        {
            count.put(a, count.getOrDefault(a,0)+1);
        }
        int total = 0;
        for(Map.Entry <Integer , Integer> entry : count.entrySet())
        {
            int x = entry.getKey();
            int cnt = entry.getValue();
            int groupSize = x+1;
            int groups  = (cnt + groupSize -1 ) / groupSize;
            total += groups * groupSize;
        }
        return total;
        
    }
}