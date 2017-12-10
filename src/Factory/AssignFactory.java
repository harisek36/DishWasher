package Factory;

/**
 * Created by harishsekar on 12/1/17.
 */
public class AssignFactory {

    public AssignFactory(DishWasher_DataFormat dishes) {

        Factory factory = new Factory();

        Washing_Types washing_types = factory.getDishType(dishes.getMaretial_type());


        Template_.setupTemplate template_setup;


        if(dishes.getMaretial_type().equalsIgnoreCase("Al")){
            template_setup = new Al();
            template_setup.play();


        } else if(dishes.getMaretial_type().equalsIgnoreCase("Metal")){
            template_setup = new Metal();
            template_setup.play();



        }else if(dishes.getMaretial_type().equalsIgnoreCase("Plastic")){
            template_setup = new Plastic();
            template_setup.play();



        }else if(dishes.getMaretial_type().equalsIgnoreCase("Glass")){
            template_setup = new Glass();
            template_setup.play();


        }
        washing_types.Process(dishes);
        System.out.println(" ");

    }

}
