public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double calcularDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
    public void actualizarStock(int cantidad) {
        stock   = stock + cantidad;
    }
}
    public void venderProducto(int cantidad) {
        if(stock >= cantidad){
            stock -= cantidad;
            System.out.println("Venta realizada");
        } else {
            System.out.println("Stock insuficiente");
        }
    }
    public void cambiarPrecio(double nuevoPrecio){
        precio = nuevoPrecio;
    }
}