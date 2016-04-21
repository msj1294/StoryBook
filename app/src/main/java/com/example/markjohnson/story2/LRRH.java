package com.example.markjohnson.story2;

/**
 * Created by markjohnson on 4/18/16.
 */
public class LRRH {
    int line = 0;

    private String[] LRRHStory = {"One day, Little Red Riding Hood's mother said to her, \"Take this basket of goodies to your grandma's cottage, but don't talk to strangers on the way!\"",
            "Promising not to, Little Red Riding Hood skipped off.",
            "On her way she met the Big Bad Wolf who asked, \"Where are you going, little girl?\"",
            "\"To my grandma's, Mr. Wolf!\" she answered.",
            "The Big Bad Wolf then ran to her grandmother's cottage, and got there much before little Red Riding Hood could",
            "He knocked on the door, and when Grandma opened it, he locked her up in the cupboard.",
            "The wicked wolf then wore Grandma's clothers and lay on her bed, waiting for Little Red Riding Hood.",
            "When Little Red Riding Hood reached the cottage, she entered and went to Grandma's bedside.",
            "\"My! What big eyes you have Grandma!\", she said in surprise. \"All the better to see you with, my dear!\", replied the wolf.",
            "\"My! What big ears you have Grandma!\", said Little Red Riding Hood. \"All the better to hear you with, my dear!\", said the wolf.",
            "\"My! What big teeth you have Grandma!\", said Little Red Riding Hood. \"All the better to eat you with!\", growled the wolf, pouncing on her.",
            "Little Red Riding Hood screamed, and the woodcutters in the forest came running into the cottage.",
            "The beat the Big Bad Wolf, and rescued Grandma from the cupboard.",
            "Grandma hugged Little Red Riding Hood with joy, and the Big Bad Wolf ran away never to be seen again.",
            "Little Red Riding Hood learned her lesson, and never spoke to strangers ever again.",
            "The End!"
    };
    public String nextLine(){
        if(line == LRRHStory.length){
            return null;
        }
        return LRRHStory[line++];
    }


}
