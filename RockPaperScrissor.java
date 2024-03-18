import java.util.Scanner;

public class RockPaperScrissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");

        System.out.println("\nAre you ready? Write 'yes' if you are");
        String answer = scan.nextLine();

        if (answer.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock -- paper -- scissor, shoot!");
            String userChoice = scan.nextLine();
            String computerChoice = computerChoice();
            System.out.println(computerChoice);
            System.out.println("You choose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);
            String result = matchResult(computerChoice,userChoice);
            System.out.println(result);

        } else {
            System.out.println("Darn, some other time!");
        }
        scan.close();
    }

    public static String computerChoice() {
        int randomChoice = (int) (Math.random() * 3 + 1);
        String computerChoice = "";
        switch (randomChoice) {
            case 1:
                computerChoice = "rock";
                break;
            case 2:
                computerChoice = "paper";
                break;
            default:
                computerChoice = "scissor";
                break;
        }
        return computerChoice;
    }

    public static String matchResult(String compChoice, String userChoice) {
        if (userChoice.equals(compChoice)) {
            return "It's a draw!";
        }

        if ((userChoice.equals("rock") && compChoice.equals("scissor")) || (userChoice.equals("paper") && compChoice.equals("rock")) || (userChoice.equals("scissor") && compChoice.equals("paper")) )  {
            return "You win!";
        } else {
            return "Computer wins!";
        } 
    // public static user(String choice) {
    // return
    // }
    }
}
