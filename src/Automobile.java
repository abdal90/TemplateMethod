public abstract class Automobile {

    abstract void frame();
    abstract void body();
    abstract void tires();
    abstract void engine();
    abstract void interior();
    abstract void doors();


    // template method
    public final void CreateAutomobile(){
        frame();
        body();
        doors();
        engine();
        interior();
        tires();
    }

}
