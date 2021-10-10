package racinggame.model;

public class Car {

    private String name;
    private int curStep;
    private int randomNumber;

    public Car(String name) {
        this.name = name;
        this.curStep = 0;
    }

    public void play(int randomNum) {
        if (randomNum >= 4 && randomNum <= 9)
            curStep++;
    }

    public String getName() {
        return this.name;
    }

    public int getCurStep() {
        return this.curStep;
    }
}
