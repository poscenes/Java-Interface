package VTB2;

public class Main {
    public static void main(String[] args) {
        Obstacles[] obstacles = new Obstacles[3];
        obstacles[0] = new Treadmill(2000);
        obstacles[1] = new Wall(3);
        obstacles[2] = new Treadmill(5000);

        Participant[] participants = new Participant[3];
        participants[0] = new Cat();
        participants[1] = new Robot();
        participants[2] = new Human();

        for (Participant part: participants) {
            for (Obstacles obst: obstacles) {
                if (!obst.competition(part)) break;
            }
        }
    }
}
