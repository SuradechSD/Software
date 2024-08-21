public class BallB extends BallA {

    public BallB(String s){
        super(s);
    }
    public void inflate(double volume){
        System.out.println(super.getTreadmark()+"'s ball is inflated of "+volume+" cu.ft.");
    }
    public void roll(){
        System.out.println(super.getTreadmark()+" rolls smoothly");
    }
}
