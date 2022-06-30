/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gustavo
 */
public class FlyweightFactory {
    
    protected List<SpriteFlyweight> flyweights = new ArrayList<>();
 
    public enum Sprites {
        JOGADOR, INIMIGO_1, INIMIGO_2, INIMIGO_3, CENARIO_1, CENARIO_2
    }
 
    public FlyweightFactory() {
        flyweights.add(new Sprite("jogador.png"));
        flyweights.add(new Sprite("inimigo1.png"));
        flyweights.add(new Sprite("inimigo2.png"));
        flyweights.add(new Sprite("inimigo3.png"));
        flyweights.add(new Sprite("cenario1.png"));
        flyweights.add(new Sprite("cenario2.png"));
    }
 
    public SpriteFlyweight getFlyweight(Sprites jogador) {
        return switch (jogador) {
            case JOGADOR -> flyweights.get(0);
            case INIMIGO_1 -> flyweights.get(1);
            case INIMIGO_2 -> flyweights.get(2);
            case INIMIGO_3 -> flyweights.get(3);
            case CENARIO_1 -> flyweights.get(4);
            default -> flyweights.get(5);
        };
    }
    
}
