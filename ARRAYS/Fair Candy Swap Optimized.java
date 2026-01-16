class Solution{
    public static void main(String[]args){
    int sumAlice =0;
for(int a:aliceSizes){
    sumAlice+=a;
}
int sumBob =0;
for(int b:bobSizes){
    sumBob+=b;
}
int difference  = (sumBob  - sumAlice)/2;
HashSet<Integer> set = new HashSet<>();
for(int b:bobSizes)set.add(b);
for(int a : aliceSizes){
    int checkBob = a + difference;
    if(set.contains(checkBob)){
         return new int[]{a, checkBob};
    }
}
 return new int[]{-1,-1};
    }
}