package miage.dca.bowling;

public class Jeu {
    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Jeu clone(){
        return new Jeu(this.lancer1,this.lancer2);
    }

    public int getLancer1() {
        return this.lancer1;
    }

    public int getLancer2() {
        return this.lancer2;
    }

    public int nombreQuillesTombees(){
        return this.getLancer1() + this.getLancer2();
    }

    public boolean isSpare(){
        return this.nombreQuillesTombees()==10 && this.getLancer1()!=10;
    }

    public boolean isStrike(){
        return this.nombreQuillesTombees()==10 && this.getLancer1()==10;
    }
}
