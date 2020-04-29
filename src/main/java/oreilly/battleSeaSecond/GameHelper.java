package oreilly.battleSeaSecond;

import java.io.*;

//public class InputTextFromKeyboard {
//
//    public String requestNewStringFromUser() {
//        Scanner firstScanner = new Scanner(System.in); // инициируем новый сканер
//        String data = firstScanner.next(); // записываем данные от пользователя сюда
//        return data;
//    }
//
//}

public class GameHelper {

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOExeption" + e);
        }
        return inputLine;
    }
}