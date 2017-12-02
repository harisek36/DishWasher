/**
 * Created by harishsekar on 12/1/17.
 */
public class Al implements Washing_Types{

    int temp;

    Context context;
    @Override
    public void Process(DishWasher_DataFormat dish) {

        if(dish.getMaretial_type().equals("small")){
            context = new Context(new setminTemp());
            temp = context.executeStrategy(dish.getMin_temperature(),dish.getMax_temperature());
        }
        if(dish.getMaretial_type().equals("medium")){
            context = new Context(new setmidTemp());
            temp = context.executeStrategy(dish.getMin_temperature(),dish.getMax_temperature());
        }
        if(dish.getMaretial_type().equals("large")){
            Context context = new Context(new setmaxtemp());
            temp = context.executeStrategy(dish.getMin_temperature(),dish.getMax_temperature());
        }





        System.out.println("Washing Al - > "+dish.getItem_name()+ (dish.getMax_temperature())/2);


    }
}
