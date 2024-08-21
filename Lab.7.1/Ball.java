public abstract class Ball{

    private String treadmark;

    public Ball(String s){
        treadmark =s;
    }
    
    public abstract void inflate(double volume);

    public String getTreadmark() {
        return treadmark;
    }
}