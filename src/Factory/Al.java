package Factory;

import Strategy.Context;
import Strategy.setmaxtemp;
import Strategy.setmidTemp;
import Strategy.setminTemp;

/**
 * Created by harishsekar on 12/1/17.
 */
public class Al implements Washing_Types {

    int temp;

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


        System.out.println("Washing Factory.Al - > "+dish.getItem_name()+ " at  "+temp);


    }
}
