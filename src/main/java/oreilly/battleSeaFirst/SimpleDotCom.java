package oreilly.battleSeaFirst;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    int[] guessHistory = new int[8];
    int numOfGuesses = 0; //
    String result = "МИМО";
//    boolean isAlive = true;
    // int[] area = {2, 3, 4};
//    InputTextFromKeyboard stringGuess = new InputTextFromKeyboard();


//         public static void main(String[] args) {
//        SimpleDotCom dot = new SimpleDotCom(); // создать экземпляр класса
//          System.out.println("Привет. Давай играть в морской бой, напиши цифру от 1 до 7");
//      }

    public void setLocationCells(int[] locs) { //сеттер
        this.locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        //while (isValidGuess(guess)) {

//        int i = 0;
//        ArrayList <String > guessHits = new ArrayList<>();
//        guessHits.add(stringGuess);
//           for (int i = 0; i < guessHits.length; i++) {
//            guessHits[i] = i + 1;
//            //int key = Arrays.binarySearch(guessHits, 16);
//            if (guessHits.length > 15) {
//                result = "ПРЕВЫШЕНО КОЛИЧЕСТВО ХОДОВ";
//                System.out.println(guessHits[i] + result);
//                break;
//            }
//        }
//        guessHistory  [i] = i + 1;

        if (guess < 1) {
            result = "НЕПРАВИЛЬНыЙ ХОД";
            System.out.println(result);
            return result;
        }

        for (int call : guessHistory) {
            if (guess == call) {
                result = "УЖЕ ХОДИЛ СЮДА";
                return result;
            }
        }

        if (numOfGuesses >= guessHistory.length) {
            result = "ПРЕВЫШЕНО КОЛИЧЕСТВО ХОДОВ";
            return result;
        }
numOfGuesses++;

        // перебрать массив guessHistory и проверить текущий ход
        for (int i = 0; i < 8; i++) {
            guessHistory[i] = guess;
            //System.out.println((i+1) + "-й элемент массива = " +  guessHistory[i]);
        }


        for (int cell : locationCells) {
            if (guess == cell) {
                result = "ПОПАЛ";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "ПОТОПИЛ";
        }


        System.out.println(result);
        return result;


    }

//    public boolean isValidGuess(int guess) {
//        for (int call : guessHistory) {
//            if (guess == call) {
//                result = "УЖЕ ХОДИЛ СЮДА";
//                numOfGuesses++;
//                return false;
//            } else {
//                for (int i = 0; i < 8; i++) {
//                   // String newguess = stringGuess.requestNewStringFromUser();
//                    guessHistory[i] = guess;
//                }
//                System.out.println("Введите число");
//            }
////            if (guessHistory.length > 8) {
////                result = "ПРЕВЫШЕНО КОЛИЧЕСТВО ХОДОВ";
//        }
//        return true;
//    }


}

