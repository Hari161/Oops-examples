import java.util.ArrayList;

public class StudentDetails {
    private String name;

    public String getRank() {
        float percentAge = (float) getTotal() / 500 * 100;
        if (percentAge >= 95)
            return "A";
        else if (percentAge > 80 && percentAge <= 90)
            return "B";
        else if (percentAge > 70 && percentAge <= 79)
            return "C";
        else if (percentAge > 60 && percentAge <= 69)
            return "D";
        else return "Failed";
    }

    public double getTotal() {
        double total = 0;
        for (Double mark : marks) {
            total = total + mark;
        }
        return total;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollNo;
    }

    public void setRollno(int rollno) {
        this.rollNo = rollno;
    }

    public void setMarks(double marks) {
        this.marks.add(marks);
    }

    private int rollNo;
    private final ArrayList<Double> marks = new ArrayList<>();

}
