/**
 * Created by harishsekar on 12/1/17.
 */
public class Metal  implements Washing_Types{


    int temp;

    @Override
    public void Process(DishWasher_DataFormat dish) {

        if(dish.getMaretial_type().equals("small")){
            Context context = new Context(new setminTemp());
            temp = context.executeStrategy(dish.getMin_temperature(),dish.getMax_temperature());
        }
        if(dish.getMaretial_type().equals("medium")){
            Context context = new Context(new setmidTemp());
            temp = context.executeStrategy(dish.getMin_temperature(),dish.getMax_temperature());
        }
        if(dish.getMaretial_type().equals("Large")){
            Context context = new Context(new setmaxtemp());
            temp = context.executeStrategy(dish.getMin_temperature(),dish.getMax_temperature());
        }
        System.out.println("Washing Metal - > "+dish.getItem_name()+ temp);
    }


}
