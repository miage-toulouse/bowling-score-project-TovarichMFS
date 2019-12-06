package miage.dca.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {

    @Test
    public void testCalCuleScoreSansStrikeSansSpare(){
        // given: une partie avec 10 jeux identiques faisant tomber 5 quilles sur les 2 lancers
        Partie laPartie = new Partie(new Jeu(5,0));

        // when: on calcule le score
        int score = laPartie.calculeScore();

        // then: on obtient un score de 50
        assertEquals(50, score);
    }

    @Test
    public void testCalculeSCoreQueDesSpares(){
        // given: une partie avec 10 jeux identiques faisant un spare sur les 2 lancers
        Partie laPartie = new Partie(new Jeu(5,5));

        // when: on calcule le score
        int score = laPartie.calculeScore();

        // then: on obtient un score de 50
        assertEquals(150, score);
    }

    @Test
    public void testCalculeSCoreQueDesStrikes(){
        // given: une partie avec 10 jeux identiques faisant un strike sur les 10 lancers
        Partie laPartie = new Partie(new Jeu(10,0));

        // when: on calcule le score
        int score = laPartie.calculeScore();

        // then: on obtient un score de 50
        assertEquals(300, score);
    }

}
