package com.example.markjohnson.story2;

/**
 * Created by markjohnson on 4/18/16.
 */
public class LRRH {
    int line = 0;
    private String[] LRRHStory = {"Once upon a time",
            "There was a girl who had a red hood",
            "And she walked through the forest",
            "And met a wolf, and other shit"};

    public String nextLine(){
        if(line == LRRHStory.length){
            return "The End";
        }
        return LRRHStory[line++];
    }


}
