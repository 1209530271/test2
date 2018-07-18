package LearningJ;

public class ifelse {
    public static void main(String[] args) {
        /*
        int x = 11;
        int y = 9;
        if ((x != 10) && (y == 9)) {
            System.out.println("Error!");
        }
        else {
            System.out.println("Bingo!");
        }
        */
        int score = 33;

        //only support int,byte,char,short
        switch (score) {
            case 100:
                System.out.println("Execellent!");
                break;
            case 90:
                System.out.println("Good");
                break;
            case 80:
                System.out.println("Well down");
                break;
            case 60:
                System.out.println("Fair enough");
                break;
            case 0:
                System.out.println("Fail");
                break;
            default:
                System.out.println("blabla");
                break;
        }

        System.out.println("----------------------");
        //Check first, then execute
        while(score <= 20) {
            System.out.println(score);
            score--;
        }

        System.out.println("----------------------");

        //execute then check
        int score1 = 33;

        do {
            System.out.println(score1);
            score1--;
        } while(score1 <= 20);
    }
}
