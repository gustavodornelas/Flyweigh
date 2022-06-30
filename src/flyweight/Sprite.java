/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

/**
 *
 * @author gustavo
 */
public class Sprite extends SpriteFlyweight{
    
    protected Imagem imagem;

    public Sprite(String nomeDaImagem) {
        imagem = new Imagem(nomeDaImagem);
    }

    @Override
    public void desenharImagem(Ponto ponto) {
        imagem.desenharImagem();
        System.out.println("No ponto (" + ponto.x + ", " + ponto.y + ")!");
    }
    
}
