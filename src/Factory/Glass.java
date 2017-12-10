package Factory;

import Strategy.Context;
import Strategy.setmaxtemp;
import Strategy.setmidTemp;
import Strategy.setminTemp;

/**
 * Created by harishsekar on 12/1/17.
 */
public class Glass extends Template_.setupTemplate implements Washing_Types{


    int temp;

    @Override
    public void initialize() {
        System.out.println(" Initialize Water for glass material");


    }

    @Override
    public void end() {

        System.out.println(" Draining Water for  after glass process");


    }

    Context context;
    @Override
    public void Process(DishWasher_DataFormat dish) {


        if(dish.getSize().equals("small")){
            context = new Context(new setminTemp());
            temp = context.executeStrategy(dish.getMin_temperature(),dish.getMax_temperature());
        }
        if(dish.getSize().equals("medium")){
            context = new Context(new setmidTemp());
            temp = context.executeStrategy(dish.getMin_temperature(),dish.getMax_temperature());
        }
        if(dish.getSize().equals("large")){
            Context context = new Context(new setmaxtemp());
            temp = context.executeStrategy(dish.getMin_temperature(),dish.getMax_temperature());
        }

        System.out.println("Washing Factory.Glass - > " +dish.getItem_name() + " at "+temp);
    }


}
