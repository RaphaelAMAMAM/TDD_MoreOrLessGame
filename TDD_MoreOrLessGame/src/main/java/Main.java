import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MoreOrLessSystem moreOrLessSystem = new MoreOrLessSystem(100, 10);

        System.out.println("Hey user ! Ready to play?\n" +
                "Rules :\n" +
                "- Found a secret number between 0 - " + moreOrLessSystem.getNumberMax() + "\n" +
                "- You have " + moreOrLessSystem.getMaxTries() + " chances\n" +
                "Let's go !");


        while (true){

            if (moreOrLessSystem.getNumberTries() < moreOrLessSystem.getMaxTries()){
                System.out.println("Put a number : ");

                int userNumber = userInputNumber();
                if (moreOrLessSystem.checkNumber(userNumber)){
                    System.out.println("Yeah,\n Number was " + moreOrLessSystem.getSecretNumber() + ", you did it in " +
                            moreOrLessSystem.getNumberTries() + " tries.");
                    break;
                }
                moreOrLessSystem.increaseNumberOfTries();
                if(moreOrLessSystem.getIfSecretNumberIsBigger(userNumber)){
                    System.out.println("Hey pssst, secret number is bigger");
                }
                if(!moreOrLessSystem.getIfSecretNumberIsBigger(userNumber)){
                    System.out.println("Hey pssst, secret number is smaller");
                }
                System.out.println(moreOrLessSystem.calculRemainingTries(moreOrLessSystem.getNumberTries()) +
                        " chances");
            } else{
                System.out.println("Oops, you lost :(" +
                        "\n Number was " + moreOrLessSystem.getSecretNumber());
                break;
            }



            //TODO maj numberTries



        }
    }
    private static Scanner scanner = new Scanner(System.in);

    private static int userInputNumber(){
        while (true){
            try{
                return scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("ERROR : Not a number. \nPlease retry :");
            }
            scanner.nextLine();
        }
    }
}
