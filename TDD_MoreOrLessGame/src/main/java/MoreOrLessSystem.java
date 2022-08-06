public class MoreOrLessSystem {

    private final int numberMax;
    private final int maxTries;
    private final int secretNumber;
    private int numberTries;


    public MoreOrLessSystem(int numberMax, int maxTries) {
        this.numberMax = numberMax;
        this.maxTries = maxTries;
        this.secretNumber = getAleatoryNumber(numberMax);
        this.numberTries = 0;

    }

    public MoreOrLessSystem(int numberMax, int maxTries, int secretNumber) {
        this.numberMax = numberMax;
        this.maxTries = maxTries;
        this.secretNumber = secretNumber;
        this.numberTries = 0;

    }


    public int getNumberMax() {
        return numberMax;
    }

    public int getMaxTries() {
        return maxTries;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public int getNumberTries() {
        return numberTries;
    }

    public void setNumberTries(int numberTries) {
        this.numberTries = numberTries;
    }

    private int getAleatoryNumber(int maxNumber){
        return (int)(Math.random()*maxNumber);
    }

    public boolean checkNumber(int numberFromUser){
        return numberFromUser == this.secretNumber;
    }

    public void increaseNumberOfTries() {
        numberTries++;
    }

    public boolean getIfSecretNumberIsBigger(int userInput){
        return userInput < this.getSecretNumber();
    }

    public int calculRemainingTries(int totalTries){
        return this.getMaxTries() - totalTries;
    }

}
