package game;

import java.util.Scanner;

public class Game {
    public Game() {
        initGame();
    }

    private void initGame() {
        System.out.println("Voy a pensar en un número del 0 al 100 y tu tienes que adivinarlo");
        Integer randomNumber = getRandomNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("Cual crees que es el numero?");
        Integer inputNumber;
        while (true) {
            inputNumber = input.nextInt();
            if (randomNumber > inputNumber) {
                System.out.println("El numero es mayor que " + inputNumber);
            } else if (randomNumber < inputNumber) {
                System.out.println("El numero es menor que " + inputNumber);
            } else {
                System.out.println("Felicidades el numero es " + inputNumber);
                break;
            }
        }
        input.close();
    }

    public Integer getRandomNumber() {
        Double random = Math.random() * 101;
        return random.intValue();

    }

}
