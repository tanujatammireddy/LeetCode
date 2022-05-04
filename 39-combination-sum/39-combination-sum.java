class Solution {
    List<List<Integer>> result;
    int tar;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        result = new ArrayList();
        tar = target;
        Arrays.sort(candidates);
        helper(candidates,0,0,new ArrayList());
        return result;
    }
    public void helper(int[] candidates, int pos, int sum,List<Integer> list){
        
        if(sum > tar)
            return;
        if(sum == tar){
            result.add(new ArrayList(list));
        }
        else
        {
            for(int i= pos;i< candidates.length;i++){
                if(candidates[i] > tar)
                    continue;
                list.add(candidates[i]);
                helper(candidates,i,sum+candidates[i],list);
                list.remove(list.size()-1);
                
            }
            
        }
    }
    
}