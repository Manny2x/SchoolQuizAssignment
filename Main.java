import java.util.Scanner;
import java.util.*;

class Main implements Questions{
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the e-safety " +
    "multiple choice Quiz! Computing homework By - Lucas Rossini & Emmanuel Okafor \n\n");
    Random rand = new Random();
    int questionsAnsweredCorrectly = 0;
    int questionsAnswered = 0;
    int lastQuesIndex = 0;
    int currQues = 1;
    while(true){ 
      while(lastQuesIndex == currQues)
          currQues = rand.nextInt(questions.length);
      Question question = questions[currQues];
      if(question.askQuestion(scan)){
            System.out.println("You were correct!" +
             "You've been listening!");
             questionsAnsweredCorrectly++;
      }
      else {
            System.out.println("You were incorrect!" + 
            "You haven't been listening!");
      }
      questionsAnswered++;
      lastQuesIndex = currQues;

      System.out.println("Do you want to finish? Yes/No");
      String finish = new Scanner(System.in).nextLine();
      if(finish.equals("Yes"))
        break;
    }

    System.out.println("You finished with the score: " + 
        questionsAnsweredCorrectly + "/" + questionsAnswered);
  } 
}
