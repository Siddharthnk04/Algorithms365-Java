import java.util.Scanner;

public class WhichChaiAreYou 
{
    static boolean isValidOption(String option)
    {
        if ((option.isEmpty() || option.length() > 1) || (option.charAt(0) < '1' || option.charAt(0) > '4'))
        {
            System.out.println("Bro, only 1 to 4. Try again.");
            return false;
        }

    return true;        
    }

    static int askQuestion(Scanner sc, String question)
    {
        String option;

        do
        {
            System.out.println(question);
            System.out.print("Your answer (1 - 4) : ");
            option = sc.nextLine();
            
        } while (!isValidOption(option));



        return option.charAt(0) - '0';
    }

    static int calculateCategory(int score, int questions)
    {
        return (score - questions) / 4;
    }

    static String getChaiDescription(int category)
    {
        switch (category)
        {
            case 0 :
                return "You are FILTER COFFEE. Strong, punctual, always ready on time.";

            case 1 :
                return "You are MASALA CHAI. Warm, popular, a bit spicy in arguments.";

            case 2 :
                return "You are CUTTING CHAI. Small effort, maximum vibe, big personality.";

            case 3 :
                return "You are COLD COFFEE. Mostly ice, cool, and always needs a wake-up call.";

            default:
                return "";
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("  ===  Which Chai are you?  ===");

        String[] questions = 
            {
                "Q1. You wake up at: 1) 5 AM  2) 8 AM  3) 11 AM  4) 'morning' is a concept",
                "Q2. Group project: 1) You lead  2) You help  3) You add your name  4) You ask 'which project?'",
                "Q3. Exam tomorrow: 1) Revised twice  2) Started today  3) Starting now  4) What exam?",
                "Q4. Weekend plan: 1) Gym  2) Movie  3) Sleep  4) Same as weekday",
                "Q5. Your phone battery right now: 1) 100%  2) 60%  3) 20%  4) Charger is my best friend"
            };

        int question = 0;
        int score = 0;

        do
        {
            int option = askQuestion(sc, questions[question]);
            score += option;
            question++;
        } while (question < questions.length);

        int category = calculateCategory(score, questions.length);

        String chaiDescription = getChaiDescription(category);

        System.out.println("Your Score : " + score + "/" + questions.length * 4);
        System.out.println(chaiDescription);

    }
}
