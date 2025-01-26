package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String flipCoin(int inputSteps, int inputTrials) {
        int currentPosition = 0;
        int stepsCount = 0;
        int trialCount = 0;
        for (int rowNum = 0; rowNum < inputTrials; rowNum++) {
            for (int colNum = 0; colNum < inputSteps; colNum++) {
                if ((int) (Math.random() * 2) == 1) {
                    currentPosition++;
                } else {
                    currentPosition--;
                }
                stepsCount++;
            }
            trialCount++;
        }
        return String.format("%-20d %-15d %-15d", stepsCount, trialCount, currentPosition);
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        App app = new App();
        System.out.println(String.format("%-20s %-15s %-15s", "Number of Steps (N)", "Trial Number (M)", "Final Position (D)"));
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(app.flipCoin(10, 10));
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(app.flipCoin(100, 100));
        }
    }
}
