public class BallA extends Ball implements RollAble {

    public BallA(String a){
        super(a);
    }

    public void inflate(double volume){
        System.out.println(super.getTreadmark()+"'s ball is inflated of "+volume+" cu.ft.");
    }
    public void roll(){
        System.out.println(super.getTreadmark()+" roll rather smoothly");
    }
}
