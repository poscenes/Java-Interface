package VTB2;

public class Human implements Participant {
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human() {
        maxJumpHeight = 3;
        maxRunDistance = 5000;
    }

    @Override
    public boolean run(int m) {
        if (m < 0) {
            System.out.println(this.getClass() + " бежит назад и проигрывает.");
            return false;
        } else if (m > maxRunDistance) {
            System.out.println(this.toString() + " не может столько пробежать.");
            return false;
        } else {
            System.out.println(this.toString() + " успешно пробежал " + m + " метров.");
            return true;
        }
    }

    @Override
    public boolean jump(int m) {
        if (m < 0) {
            System.out.println(this.toString() + " не может прыгнуть под землю.");
            return false;
        } else if (m > maxJumpHeight) {
            System.out.println(this.toString() + " не может так прыгнуть.");
            return false;
        } else {
            System.out.println(this.toString() + " успешно перепрыгнул препятствие в " + m + " метров.");
            return true;
        }
    }
}

