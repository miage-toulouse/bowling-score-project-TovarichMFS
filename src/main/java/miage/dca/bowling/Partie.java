package miage.dca.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Jeu> jeux;

    public Partie(Jeu jeu) {
        this.jeux = new ArrayList<>();
        for(int i=0;i<10;i++){
            jeux.add(jeu.clone());
            if(i==9){
                if(jeu.isSpare())
                    jeux.add(new Jeu(jeu.getLancer1(),0));
                else if(jeu.isStrike()){
                    jeux.add(new Jeu(jeu.getLancer1(),0));
                    jeux.add(new Jeu(jeu.getLancer1(),0));
                }
            }
        }
    }

    public int calculeScore(){
        int score = 0;
        for(int i=0;i<this.jeux.size();i++){
            score += this.jeux.get(i).nombreQuillesTombees();
            if((i+1)<this.jeux.size()-1) {
                if(this.jeux.get(i).isSpare())
                    score += this.jeux.get(i + 1).getLancer1();
                if(this.jeux.get(i).isStrike()) {
                    score += this.jeux.get(i + 1).nombreQuillesTombees();
                    if((i+2)<this.jeux.size()-2)
                        score += this.jeux.get(i + 2).nombreQuillesTombees();
                }
            }
        }
        return score;
    }
}
