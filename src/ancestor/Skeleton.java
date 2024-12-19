package ancestor;

public class Skeleton  extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public void info(){
        super.info();
        System.out.println("arrows: " + arrows);
    }
}
