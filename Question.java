class Question {
  private String question;
  private String firstChoice;
  private String secondChoice;
  private String thirdChoice;
  private int[] correct;

  Question(String question, String firstChoice,
            String secondChoice, String thirdChoice,
            int ... correctAnswers){
    this.question = question;
    this.firstChoice = firstChoice;
    this.secondChoice = secondChoice;
    this.thirdChoice = thirdChoice;
    this.correct = correctAnswers;
  }

  public boolean askQuestion(Scanner scan){
      System.out.println(question + "\n" + 
          firstChoice + "\n" + 
          secondChoice + "\n" + 
          thirdChoice);

      int userAnswer = scan.nextInt();
      for(int answer: correct){
        if(userAnswer == answer)
          return true;
      }
      return false;
  }
} 
