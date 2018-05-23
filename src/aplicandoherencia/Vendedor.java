
package aplicandoherencia;

public class Vendedor extends Empleado{
    private String CodigoVendedor;
    private String rutaAsignada;
    private int NumeroClientes;

    public Vendedor() {
    }

    public Vendedor(String CodigoVendedor, String rutaAsignada, int NumeroClientes) {
        this.CodigoVendedor = CodigoVendedor;
        this.rutaAsignada = rutaAsignada;
        this.NumeroClientes = NumeroClientes;
    }

    public Vendedor(String CodigoVendedor, String rutaAsignada, int NumeroClientes, String nombre, int edad) {
        super(nombre, edad);
        this.CodigoVendedor = CodigoVendedor;
        this.rutaAsignada = rutaAsignada;
        this.NumeroClientes = NumeroClientes;
    }

    public String getCodigoVendedor() {
        return CodigoVendedor;
    }

    public void setCodigoVendedor(String CodigoVendedor) {
        this.CodigoVendedor = CodigoVendedor;
    }

    public String getRutaAsignada() {
        return rutaAsignada;
    }

    public void setRutaAsignada(String rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }

    public int getNumeroClientes() {
        return NumeroClientes;
    }

    public void setNumeroClientes(int NumeroClientes) {
        this.NumeroClientes = NumeroClientes;
    }
    
    
}
