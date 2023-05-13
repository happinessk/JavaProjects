public class MadLibs {
  /*
  This program generates a mad libbed story.
Author: Happiness
Date: 5/12/2023

In this project, we’ll use Java to write a Mad Libs word game! Mad Libs have short stories with blank spaces that a player can fill in. The result is usually funny (or strange).
Mad Libs require: A short story with blank spaces (asking for different types of words). Words from the player to fill in those blanks.
  */
  	public static void main(String[] args){ 
      String name1 = "Teddy";
      String adjective1 = "happy";
      String adjective2 = "wonderful";
      String adjective3 = "birds";
      String verb1 = "sleep";
        String noun1 = "cakes";
        String noun2 = "cats";
        String noun3 = "were";
        String noun4 = "a tree";
        String noun5 = "portugal";
        String noun6 = "babies";
        String name2 = "Happiness";
        String place1 = "Kenya";
        int number =2302;
   //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+" were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
     
    }       
}
