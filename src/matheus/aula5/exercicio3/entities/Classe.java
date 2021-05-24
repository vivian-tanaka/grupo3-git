package matheus.aula5.exercicio3.entities;

public enum Classe {

    GUERREIRO("Para quem busca combate corpo a corpo os guerreiros são uma das classes mais indicadas. Eles podem carregar instrumentos como machados, armaduras, escudos e etc."),
    MAGO("Enquanto os necromantes utilizam poderes a partir de mortos, os magos se fazem valer de poderes naturais e elementais. O maior poder de um mago e poder usar magia branca, como raios de luzes e poderes de cura. Dessa forma, eles são extremamentes importantes em uma jornada de longa duração."),
    ARQUEIRO("Arqueiros usam um arco e flecha."),
    BARDO("Bardos são as criaturas que utilizam seus instrumentos musicais como armas. Isso ocorre devido ao talento nato que eles possuem para a arte, por isso não é difícil encontrar algum bardo com talentos de imitações, disfarces e entre outros.");

    private String descricao;

    Classe(String descricao){
        this.descricao = descricao;
    }

}
