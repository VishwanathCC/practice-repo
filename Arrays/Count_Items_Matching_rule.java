package com.vishu.Arrays;

public class Count_Items_Matching_rule {
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "color"; String ruleValue = "silver";
        System.out.println(countMatches(items,"color","silver"));
    }
    public static int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int count = 0;
        if(ruleKey.equals("type")){
        for(int i=0; i<3; i++){
            if(items[i][0].equals(ruleValue)){
                count++;
            }
        }
    }else if(ruleKey.equals("color")){
        for(int i=0; i<3; i++){
            if(items[i][1].equals(ruleValue)){
                count++;
            }
        }
    }else{
        for(int i=0; i<3; i++){
            if(items[i][2].equals(ruleValue)){
                count++;
            }
        }
    }
        return count;
}
}
