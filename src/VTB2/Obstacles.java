package VTB2;

interface Participant {
    boolean jump(int m);
    boolean run(int m);
}

abstract class Obstacles {
    abstract public boolean competition(Participant participant);
}

class Treadmill extends Obstacles {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean competition(Participant participant) {
        if (participant.run(distance)) {
            System.out.println(participant.toString() + " пробежал дистанцию в " + distance + " м.!");
            return true;
        } else {
            System.out.println(participant.toString() + "не смог пробежать дистанцию в " + distance +"м. и выбывает.");
            return false;
        }
    }
}

class Wall extends Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean competition(Participant participant) {
        if (participant.jump(height)) {
            System.out.println(participant.toString() + " перепрыгнул стену в " + height + " м.!");
            return true;
        } else {
            System.out.println(participant.toString() + "не смог перепрыгнуть стену в " + height + " м. и выбывает.");
            return false;
        }
    }
}