import java.util.List;

public interface Saveable {
    void setValues(List<String> savedValues);
    List<String> getValues();
}
