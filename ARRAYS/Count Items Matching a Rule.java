class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int index=0, res =0;
    if(ruleKey.equals("type")){
        index=1;
    }else if(ruleKey.equals("color")){
        index=2;
    }else{
        index=3;
    }
    for(int i=0; i<items.size(); i++){
       if( items.get(i).get(index-1).equals(ruleValue)){
        res++;
       }
    }
    return res;
    }
}