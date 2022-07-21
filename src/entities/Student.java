package entities;

public class Student {
    public String Name;
    public double FirstNote;
    public double SecondNote;
    public double ThirdNote;

    public double FinalGrade() {
        return (FirstNote + SecondNote + ThirdNote );
    }
    public boolean IsPass() {
        return FinalGrade() >= 60;
    }
    public double MissingPoints() {
        return 60 - FinalGrade();
    }
}
