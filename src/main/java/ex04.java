/*
Exercise 4 - Mad Lib

Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.
Example Output

Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints

    Use a single output statement for this program.
    If your language supports string interpolation or string substitution, use it to build up the output.

Challenges

    Add more inputs to the program to expand the story.
    Implement a branching story, where the answers to questions determine how the story is constructed.

*/
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);
        String story;

        System.out.print("Enter a noun: ");
        String noun = cursor.nextLine();
        story = "The " + noun;

        System.out.print("Enter a verb: ");
        String verb = cursor.nextLine();
        story += " " + verb;

        System.out.print("Enter a adjective: ");
        String adjective = cursor.nextLine();
        story += " along the " + adjective + " pathway ";

        System.out.print("Enter a adverb: ");
        String adverb = cursor.nextLine();
        story += adverb + ".";

        System.out.print(story);
    }

}
