public class Productos {
    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected String genero;
    protected char clasificacion;
    
    public Productos(){

    }
    public Productos(String codigo, String nombre, String descripcion, double precio, String genero, char clasificacion){
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
        this.setGenero(genero);
        this.setClasificacion(clasificacion);
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public char getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(char clasificacion) {
        this.clasificacion = clasificacion;
    }
    @Override
    public String toString() {
        return "Codigo: " + this.getCodigo() + "\nNombre: " + this.getNombre() + "\nDescripcion: " + this.getDescripcion() + "\nPrecio: " + this.getPrecio() +"\nGenero: " + this.getGenero() + "\nDescripcion: \n" + this.getDescripcion();
    }
}
