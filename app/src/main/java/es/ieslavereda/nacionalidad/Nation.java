package es.ieslavereda.nacionalidad;

public enum Nation implements Listable{
    GERMANY(R.drawable.s_alemania, R.drawable.i_alemania),
    FRANCE(R.drawable.s_francia, R.drawable.i_francia),
    ITALY(R.drawable.s_italia, R.drawable.i_italia),
    PORTUGAL(R.drawable.s_portugal, R.drawable.i_portugal),
    SPAIN(R.drawable.s_espanya, R.drawable.i_espanya);

    private int symbol;
    private int image;

    Nation(int symbol, int image){
        this.symbol=symbol;
        this.image=image;
    }


    @Override
    public String getDescription() {
        return this.name();
    }

    @Override
    public int getDrawableSymbol() {
        return symbol;
    }

    @Override
    public int getDrawableImage() {
        return image;
    }
}
