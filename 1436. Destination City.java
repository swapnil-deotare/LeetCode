class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> outdegree = new HashMap<>();
        
        for(List<String> edge: paths){ 
            outdegree.put(edge.get(0), outdegree.getOrDefault(edge.get(0),0)+1);
            outdegree.put(edge.get(1), outdegree.getOrDefault(edge.get(1),0));
        }
        
        for(String city : outdegree.keySet()){
            if(outdegree.get(city) == 0) return city;
        }
        
        return "";
    }
}