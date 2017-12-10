package Strategy;

/**
 * Created by harishsekar on 12/1/17.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int min,int max){

        return strategy.setTemp(min,max);
    }
}
