import java.util.Arrays;

public class Netiflox {
    private Productos productos[];
    private Clientes listaClientes[];
    private Productos fav[];
    
    public void agegarFavoritos(Productos prod) {
        int i = 0;
        if (Arrays.asList(productos).contains(prod)) {
            fav[i] = prod;
            System.out.println("Se a guardado el producto en tu Lista de Favoritos.");
        }else{
            System.out.println("No se encontro el producto en nuesta lista.");
        }
        i++;
    }
    public void listarProductos(){
        for (int a = 0; a <= this.productos.length; a++){
            if (productos[a] != null){
                System.out.println(this.productos[a].toString());
            }
        }
        
    }
    public void filtrarPorCategoria(String categori){
        Object categoria = categori;
        Productos prod = new Productos();
        if (Arrays.asList(productos).contains(categoria)){
            for (int i = 0; i < productos.length; i++) {
                if(prod.getGenero().equals(categoria)){
                    prod.toString();
                }
            }
        }
    }
    public void registrarClientes(){

    }
    public void mostrarClientes(){

    }
    public void agregarMovimiento(){

    }

    public Productos[] getProductos() {
        return productos;
    }
    public void setProductos(Productos productos[]) {
        this.productos = productos;
    }
    public Clientes[] getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(Clientes listaClientes[]) {
        this.listaClientes = listaClientes;
    }

}
