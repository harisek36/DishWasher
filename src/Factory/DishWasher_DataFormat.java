package Factory;

/**
 * Created by harishsekar on 12/1/17.
 */
public class DishWasher_DataFormat {

    private String Item_name;
    private String Maretial_type;
    private String  Size;
    private int Min_temperature;
    private int Max_temperature;

    private int total_line;

    public int getTotal_line() {
        return total_line;
    }

    public void setTotal_line(int total_line) {
        this.total_line = total_line;
    }

    public String getItem_name() {
        return Item_name;
    }

    public void setItem_name(String item_name) {
        Item_name = item_name;
    }

    public String getMaretial_type() {
        return Maretial_type;
    }

    public void setMaretial_type(String maretial_type) {
        Maretial_type = maretial_type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public int getMin_temperature() {
        return Min_temperature;
    }

    public void setMin_temperature(int min_temperature) {
        Min_temperature = min_temperature;
    }

    public int getMax_temperature() {
        return Max_temperature;
    }

    public void setMax_temperature(int max_temperature) {
        Max_temperature = max_temperature;
    }
}
