package org.dsa.string;

public class MinimumDeletion_To_Make_BalanceString {
    public static void main(String[] args){
        String str = "aababbab";
        int minimumDeletionCount = minimumDeletions(str);
        System.out.println(" minimumDeletionCount :: "+minimumDeletionCount);
    }

   public static int  minimumDeletions(String str){
        int bCount =0;
        int deletions = 0;

        for(char ch: str.toCharArray()){
            if(ch=='b'){
                bCount++;
            }else{// ch == 'a'
                // Option 1: delete this 'a' -> deletions + 1
                // Option 2: delete all previous 'b' -> bCount
                deletions = Math.min(deletions+1,bCount);
            }
        }
        return deletions;
    }
}
