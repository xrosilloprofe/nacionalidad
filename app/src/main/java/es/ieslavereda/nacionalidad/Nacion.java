package es.ieslavereda.nacionalidad;

public enum Nacion implements Listable{
    ALEMANIA, FRANCIA, ITALIA, PORTUGAL, ESPAÑA;

    @Override
    public String getDescription() {
        return this.name();
    }

    @Override
    public int getDrawableSimbol() {
        if(this==ALEMANIA)
            return R.drawable.s_alemania;
        else if(this==ITALIA)
            return R.drawable.s_italia;
        else if(this==FRANCIA)
            return R.drawable.s_francia;
        else if(this==PORTUGAL)
            return R.drawable.s_portugal;
        else return R.drawable.s_espanya;
    }

    @Override
    public int getDrawableImage() {
        if(this==ALEMANIA)
            return R.drawable.i_alemania;
        else if(this==ITALIA)
            return R.drawable.i_italia;
        else if(this==FRANCIA)
            return R.drawable.i_francia;
        else if(this==PORTUGAL)
            return R.drawable.i_portugal;
        else return R.drawable.i_espanya;
    }
}
