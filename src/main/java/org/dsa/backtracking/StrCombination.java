package org.dsa.backtracking;

public class StrCombination {
    public static void main(String[] args){
        String str="abc";
        combinaton(str,0,"");
    }
   static void combinaton(String str, int index,String result){
         if(!result.isEmpty()){
             System.out.println(result);
         }

         for(int i=index; i<str.length(); i++){
             combinaton(str,i+1,result+ str.charAt(i));
         }
    }
}
