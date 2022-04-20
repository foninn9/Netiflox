import java.util.Arrays;
import java.util.Scanner;

public class Netiflox {
    private Productos productos[];
    private Clientes listaClientes[];
    private Productos fav[];
    Scanner Sn = new Scanner(System.in);
    
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
        //Productos prod = new Productos();
        //if (Arrays.asList(productos).contains(categoria)){
            //for (int i = 0; i < productos.length; i++) {
                //if(prod.getGenero().equals(categoria)){
                    productos.toString().equals(categoria);
                //}
            //}
        //}
    }
    public void registrarClientes(){
        String membresia = null;
        String nombre; 
        long tel; 
        String correo;
        System.out.println("¿Cual es tu nombre?");
        nombre = Sn.next();
        System.out.println("Escribe tu numero de telefono");
        tel = Sn.nextLong();
        System.out.println("Escribe tu correo");
        correo = Sn.next();
        System.out.println("¿Que tipo de membresia prefieres?");
        System.out.println("1. Anual \n2. Mensual \n3. Prepago \nEscribe el numero");
        int r = Sn.nextInt();
        int i = 0;
        do {
            switch (r){
                case 1:
                    membresia = "Anual";
                    i++;
                break;
                case 2:
                    membresia = "Mensual";
                    i++;
                break;
                case 3:
                    membresia = "Prepago";
                    i++;
                break;
                default:
                    System.out.println("Escribe un numero de los indicados");
                break;
            }
        } while (i == 1);
        new Clientes(membresia, nombre, tel, correo);
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
