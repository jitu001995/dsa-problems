package org.dsa.string;

public class Find_First_Occurence_Of_String {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

      int occurenceIndex =   findOccurence(haystack,needle);
      System.out.println("occurence Index :: "+occurenceIndex);
    }

    private static int findOccurence(String haystack, String needle) {
        if(needle.length() == 0 ) return 0;

        int[] lps = buildLps(needle);
        int i=0;
        int j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                if(j==needle.length()){
                    return i-j;
                }
            }else{
                if(j != 0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;
    }
    public static int[] buildLps(String pattern){
        int [] lps = new int[pattern.length()];
        int len = 0;
        int i=1;
        while(i<pattern.length()){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len !=0){
                  len =  lps[len-1];
                }else{
                    lps[i] =0;
                    i++;
                }
            }
        }
        return lps;
    }
}
