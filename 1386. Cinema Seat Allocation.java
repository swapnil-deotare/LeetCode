class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        
        for(int[] res : reservedSeats) {
            Set<Integer> set = map.getOrDefault(res[0], new HashSet<>());
            set.add(res[1]);
            map.put(res[0], set);
        }
        
        int result = (n - map.size()) * 2;
        boolean flag = false;
        
        for (Set<Integer> set : map.values()) {
            flag = false;
            
            if (!set.contains(2) && !set.contains(3) && !set.contains(4) && !set.contains(5)) {
                result++;
                flag = true;
            }
            
            if (!set.contains(6) && !set.contains(7) && !set.contains(8) && !set.contains(9)) {
                result++;
                flag = true;
            } 
            
            if (!flag && !set.contains(4) && !set.contains(5) && !set.contains(6) && !set.contains(7)) {
                result++;
            }
        }
        
        return result;
    }
}