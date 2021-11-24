package HWThreeEnhAndOver.Task002;

public class Run {

    public static void main(String[] args) {
        Pupil pupilOne = new GoodPupil();
        Pupil pupilTwo = new GoodPupil();
        Pupil pupilThree = new BadPupil();
        System.out.println("Методы учеников: \n");
        ClassRoom [] classRoom = {new ClassRoom(pupilOne), new ClassRoom(pupilTwo), new ClassRoom(pupilThree, pupilOne)};

        for (ClassRoom room : classRoom) {
            System.out.println(room);;
        }
    }
}
