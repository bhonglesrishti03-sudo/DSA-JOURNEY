class solution{
    public static void main(String[]args){
    //     String s = "SRISHTI";
    //    //manual reverse
    //    String ans = "";
    //    for(int i=s.length()-1; i>=0; i--){
    //        ans = ans + s.charAt(i);
    //    }
    //    System.out.println(ans);

     
       String s = "SRISHTI";
       StringBuilder sb = new StringBuilder();
       for(int i=s.length()-1; i>=0;i--){
           sb.append(s.charAt(i));
       }
       System.out.println(sb.toString());
    }


}