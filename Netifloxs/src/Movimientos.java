import java.util.Date;

public class Movimientos {
    private Clientes cliente;
    private Date fecha;
    private String tipoMovimiento;
    private Productos prod[];

    public Productos[] getProducto() {
        return prod;
    }

    public void setProducto(Productos[] prod) {
        this.prod = prod;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

}
