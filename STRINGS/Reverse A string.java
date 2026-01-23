class solution{
    public static void main(String[]args){
    //     String s = "SRISHTI";
    //    //manual reverse
    //    String ans = "";
    //    for(int i=s.length()-1; i>=0; i--){
    //        ans = ans + s.charAt(i);
    //    }
    //    System.out.println(ans);

     
    //    String s = "SRISHTI";
    //    StringBuilder sb = new StringBuilder();
    //    for(int i=s.length()-1; i>=0;i--){
    //        sb.append(s.charAt(i));
    //    }
    //    System.out.println(sb.toString());

    String s = "hello";
       char[]arr = s.toCharArray();
       int i=0;
       int j = arr.length-1;
       while(i<j){
           char temp = arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
       System.out.println(new String(arr));
    }


}