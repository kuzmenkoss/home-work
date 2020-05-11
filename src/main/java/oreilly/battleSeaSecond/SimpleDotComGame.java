package oreilly.battleSeaSecond;

public class SimpleDotComGame {

    public static void main(String[] args) {
        SimpleDotComGame dot = new SimpleDotComGame(); // создать экземпляр класса
//        int[] locations = {2, 3, 4};
  //      dot.setLocationCells(locations);

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

       // theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("ПОТОПИЛ")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}