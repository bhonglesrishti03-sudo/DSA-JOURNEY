class Solution {
    public boolean checkOnesSegment(String s) {
       //basically in this question we need to see that there should be at most one segment of ones that doesnt mean we need contagious ones only we need like 10 here there is a 1 hence ok like 000 that still ok there can be atmost a 1 now like 101 here we got two ones that is seperated by 0 hence it becomes two segments thats why we cant take it so basically the pattern becomes 1110001now what changed the need the 0's so just check if there is a 01 in the string if it does return false else all will be true
      if(s.contains("01")){
        return false;
      }
      return true;
    }
}
