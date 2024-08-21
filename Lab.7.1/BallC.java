public class BallC extends BallA {

    public BallC(String s){
        super(s);
    }

    public void inflate(double volume){
        System.out.println(super.getTreadmark()+"'s ball is inflated of "+volume+" cu.ft.");
    }
    public void roll(){
        System.out.println(super.getTreadmark()+" roll very smoothly");
    }
}
