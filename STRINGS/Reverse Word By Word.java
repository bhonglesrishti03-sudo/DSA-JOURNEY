 String s = "I want to be the best";
       String[]words = s.split(" ");
       StringBuilder ans = new StringBuilder();
       for(int i= words.length-1; i>=0; i--){
           ans.append(words[i]).append(" ");
       }
       System.out.println(ans.toString().trim());
