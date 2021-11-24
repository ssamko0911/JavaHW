package HWThreeEnhAndOver.Task002;

public class ClassRoom {

    public ClassRoom(Pupil pupil) {
      callAllPupilMethods(pupil);
    }

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo) {
        this(pupilOne);
        callAllPupilMethods(pupilTwo);
    }

    public ClassRoom(Pupil pupilOne, Pupil pupilTwo, Pupil pupilThree) {
        this(pupilOne, pupilTwo);
        callAllPupilMethods(pupilThree);

    }

    public void callAllPupilMethods(Pupil somePupil) {
        somePupil.study();
        somePupil.write();
        somePupil.read();
        somePupil.relax();
    }
}
