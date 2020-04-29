package oreilly.battleSeaFirst;

import java.util.Scanner;

public class InputTextFromKeyboard {

    public String requestNewStringFromUser ( ) {
        Scanner firstScanner = new Scanner(System.in); // инициируем новый сканер
        String userGuess = firstScanner.next(); // записываем данные от пользователя сюда
        return userGuess;
    }

}
