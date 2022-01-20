class Solution {
    public int lengthLongestPath(String input) {
        int maxLength=0;
        String[] paths=input.split("\n");
        Stack<PathVal> st=new Stack<>();
        for(String path:paths){
            int count=0;
            for(int i=0;i<path.length();i++){
                char c=path.charAt(i);
                if(c=='\t'){
                    count++;
                }
            }
             while(!st.empty()&&(st.peek().count>=count)){
                st.pop();
            }
            int length=path.length()+(st.empty()?0:st.peek().length);
            length=length-count;
            if(!st.empty())length++;
            PathVal pathVal=new PathVal(count,length);
            if(path.contains(".")){
                maxLength=Math.max(maxLength,pathVal.length);
            }
            st.push(pathVal);
        }
        return maxLength;
    }
}
class PathVal{
    int count,length;
    public PathVal(int count,int length){
        this.count=count;
        this.length=length;
    }
}