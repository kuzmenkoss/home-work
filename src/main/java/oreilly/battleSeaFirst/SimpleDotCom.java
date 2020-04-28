package oreilly.battleSeaFirst;

import java.util.Arrays;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    int[] guessHistory = new int[8];
    int numOfGuesses = 0; //
    boolean isAlive = true;
    // int[] area = {2, 3, 4};

//    public static void main(String[] args) {
//        SimpleDotCom dot = new SimpleDotCom(); // создать экземпляр класса
//        System.out.println("Привет. Давай играть в морской бой, напиши цифру от 1 до 7");
//        InputTextFromKeyboard stringGuess = new InputTextFromKeyboard();
//
//    }

    public void setLocationCells(int[] locs) { //это не понятно зачем
        this.locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
       //метод булеан тру фолсе                 isValidHit
        String result = "МИМО";
        int i = 0;

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
        guessHistory  [i] = i + 1;

            if (guess < 1) {
                result = "НЕПРАВИЛЬНыЙ ХОД";
                System.out.println(result);
                return result;
            } else {
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
                if (guessHistory.length > 8) {
                    result = "ПРЕВЫШЕНО КОЛИЧЕСТВО ХОДОВ";
                }
            }


        System.out.println(result);
        return result;

    }
}

