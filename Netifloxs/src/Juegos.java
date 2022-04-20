public class Juegos extends Productos{
    private String version;

    public Juegos(){

    }
    public Juegos(String codigo, String nombre, String descripcion, double precio, String genero, char clasificacion, String version){
        super(codigo, nombre, descripcion, precio, genero, clasificacion);
        this.setVersion(version);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    @Override
    public String toString() {
        return super.toString() + "\nVersion: " + this.getVersion();
    }
}
