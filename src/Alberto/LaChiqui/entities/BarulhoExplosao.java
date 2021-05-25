package Alberto.LaChiqui.entities;

public enum BarulhoExplosao {

    KABUM(0),
    POW(1),
    XIIIUUUU_POW(2),
    TATATATA(3);

    private int index;

    BarulhoExplosao(int index){
        this.index = index;
    }

    public static BarulhoExplosao getBarulhoAleatorio(){
        int rand = (int) ((Math.random() * (BarulhoExplosao.values().length - 1)) + 0);

        for(BarulhoExplosao barulho : BarulhoExplosao.values()){
            if(barulho.index == rand){
                return barulho;
            }
        }
        return BarulhoExplosao.KABUM;
    }
}
