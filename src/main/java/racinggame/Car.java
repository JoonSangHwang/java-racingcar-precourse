package racinggame;

public class Car {

    private String name;
    private int curStep;

    public Car(String name) {
        this.name = name;
        this.curStep = 0;
    }

    public void play(int randomNum) {
        if (randomNum >= 4 && randomNum <= 9)
            curStep++;
    }

    public int getCurStep() {
        return this.curStep;
    }
}
