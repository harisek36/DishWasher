package Singleton;

import Factory.AssignFactory;
import Factory.DishWasher_DataFormat;
import Iterator_.Iterator;


/**
 * Created by harishsekar on 12/1/17.
 */
public class Process_dish {
    private static Process_dish ourInstance = new Process_dish();

    public static Process_dish getInstance() {
        return ourInstance;
    }

    private Process_dish() {
        Iterator_.GetItems namesRepository = new Iterator_.GetItems();


        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            DishWasher_DataFormat name = (DishWasher_DataFormat)iter.next();
            AssignFactory assignFactory = new AssignFactory(name);


        }

        ;

    }





}
