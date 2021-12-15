import java.util.ArrayList;
import java.util.List;

public class Cricket implements Saveable {
    private String batsManname;
    private int chestNumber;
    private long totalRuns;

    @Override
    public void setValues(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            batsManname = savedValues.get(0);
            chestNumber = Integer.parseInt(savedValues.get(1));
            totalRuns = Long.parseLong(savedValues.get(2));
        }
    }

    @Override
    public List<String> getValues() {
        List<String> values = new ArrayList<>();
        values.add(0, batsManname);
        values.add(1, "" + chestNumber);
        values.add(2, "" + totalRuns);
        return values;
    }

    @Override
    public String toString() {
        return "Player Details{" +
                "Player name='" + batsManname + '\'' +
                ", Chest Number=" + chestNumber +
                ", Total runs=" + totalRuns +
                '}';
    }
}
