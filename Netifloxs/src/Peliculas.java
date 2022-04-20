public class Peliculas extends Productos{
    private int duracion;

    public Peliculas(){

    }
    public Peliculas (String codigo, String nombre, String descripcion, double precio, String genero, char clasificacion, int duracion){
        super(codigo, nombre, descripcion, precio, genero, clasificacion);
        this.setDuracion(duracion);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    @Override
    public String toString() {
        return super.toString() + "\nDuracion: " + this.getDuracion() + "Min.";
    }

}
