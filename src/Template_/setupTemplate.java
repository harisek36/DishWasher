package Template_;

public abstract class setupTemplate {
    public abstract void initialize();

    public abstract void end();

    //template method
    public final void play(){

        //initialize the game
        initialize();



        //end game
        end();
    }
}
