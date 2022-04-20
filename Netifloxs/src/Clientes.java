public class Clientes {
    private String membresia;
    private String nombre;
    private long tel;
    private String correo;
    

    public String getMembresia() {
        return membresia;
    }
    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getTel() {
        return tel;
    }
    public void setTel(long tel) {
        this.tel = tel;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\nTelefono: " + this.getTel() + "\nCorreo: " + this.getCorreo() + "\nMembresia: " + this.getMembresia();
    }
}
