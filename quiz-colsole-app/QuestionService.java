
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    int result = 0;

    public QuestionService() {
        questions[0] = new Question("1", "Is Multiple Inheritance Support in JAVA?", new String[]{"Yes", "No"},
                "No");

        questions[1] = new Question(
                "2",
                "Which keyword is used to inherit a class in Java?",
                new String[]{"implements", "extends", "inherits", "super"},
                "extends");

        questions[2] = new Question(
                "3",
                "Which method is the entry point of a Java program?",
                new String[]{"start()", "run()", "main()", "init()"},
                "main()");

        questions[3] = new Question(
                "4",
                "Can a Java class implement multiple interfaces?",
                new String[]{"Yes", "No"},
                "Yes");

        questions[4] = new Question(
                "5",
                "Which of the following is not a primitive data type in Java?",
                new String[]{"int", "String", "double", "char"},
                "String");
    }

    public void displayQuestions() {
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            q.getOptions();
        }
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            q.getOptions();

            System.out.println("");

            String selectedAnswer = sc.nextLine();

            String answer = q.getAnswer();

            if (selectedAnswer.trim().equalsIgnoreCase(answer)) {
                System.out.println("Right");
                result++;
            } else {
                System.out.println("Wrong");
            }

        }

        System.out.println("Your Final Score is: " + result);
    }
}
