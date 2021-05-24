package Aula3_TT_Pratica_Alberto.Classes;

public enum Classe {

    // campo(descrição), campo(descrição), [...] ;
    GUERREIRO("Guerreiro é para jogadores de linha de frente, pode aguentar muito dano mas é propenso à magia"),
    MAGO("Usuário de magia, não aguenta muito dano e prefere manter distancia na batalha"),
    DRUIDA("Jogador da natureza, tem forte interação com animais e plantas e suas magias envolvem forças naturais"),
    CLERIGO("Usurario de magia, seus poderes tem origem divina, pode usar magias de cura e de diversos elementos, podem lutar tanto na linha de frente quanto à distância"),
    LADINO("Não confundir com latino, é usuário furtivo, se esconde esperando momento certo para atacar"),
    KENSEI("Expansão da classe guerreiro, pode usar poucas magias, mas sua vantagem é utilizar uma arma mágia 'abençoada' com elo espiritual");

    // declara descrição tipo string
    private String descrição;

    // "nome do enum" (<Tipo> nome)
    Classe(String descrição){
        this.descrição = descrição;
    }


}
