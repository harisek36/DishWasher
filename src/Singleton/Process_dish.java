package Singleton;

import Factory.AssignFactory;
import Factory.DishWasher_DataFormat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by harishsekar on 12/1/17.
 */
public class Process_dish {
    public List<DishWasher_DataFormat> dishes = new ArrayList<DishWasher_DataFormat>();
    private static Process_dish ourInstance = new Process_dish();
    java.util.Iterator<DishWasher_DataFormat> itr =  dishes.iterator();

    public static Process_dish getInstance() {
        return ourInstance;
    }

    private Process_dish() {
        getData_from_textFile();

        itr =  dishes.iterator();
        while(itr.hasNext()) {
            AssignFactory assignFactory = new AssignFactory(itr.next());
        }


    }


    public void getData_from_textFile(){

        String fileName = "src/DataBase/file_name";
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
