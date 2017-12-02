import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by harishsekar on 12/1/17.
 */
public class GetItems implements  Container {


    public ArrayList<DishWasher_DataFormat> dishes = new ArrayList<>();

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < dishes.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return dishes.get(index++);
            }
            return null;
        }
    }

    public GetItems() {
        getData_from_textFile();
    }

    public void getData_from_textFile(){

        String fileName = "src/file_name";
        DishWasher_DataFormat get_dish_linebyline;

        String line  = null;
        int index = 0;

        try {

            FileReader fileReader =  new FileReader(fileName);

            BufferedReader bufferedReader =  new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {

                index++;

                String splitted[] = line.split("\\s+");
                get_dish_linebyline = new DishWasher_DataFormat();

                get_dish_linebyline.setItem_name(splitted[0]);
                get_dish_linebyline.setMaretial_type(splitted[1]);
                get_dish_linebyline.setSize(splitted[2]);

                get_dish_linebyline.setMin_temperature(Integer.parseInt(splitted[3]));
                get_dish_linebyline.setMax_temperature(Integer.parseInt(splitted[4]));

                get_dish_linebyline.setTotal_line(index);

                dishes.add(get_dish_linebyline);



            }



            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" +  fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"  + fileName + "'");

        }
    }



}
