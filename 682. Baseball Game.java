class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> list = new ArrayList();
        int sum = 0;
        for(int i=0;i<ops.length;i++){
            String c = ops[i];
            if(c.equals("C")){
                sum-= list.get(list.size()-1);
                list.remove(list.size()-1);
            }else if(c.equals("+")){
                list.add(list.get(list.size()-1) + list.get(list.size()-2));
                sum+= list.get(list.size()-1);
            }else if(c.equals("D")){
                list.add(list.get(list.size()-1)*2);
                sum+= list.get(list.size()-1);
            }else{
                list.add(Integer.valueOf(c));
                sum+= list.get(list.size()-1);
            }    
        }
       return sum;
    }
}