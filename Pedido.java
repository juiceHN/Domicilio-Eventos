import java.util.ArrayList;

public class Pedido
{
    private String nombreCliente;

    private String ubicacion;

    private String precio;

    private ArrayList <String> Productos;

private String tipoPedido; 

private Integer cantidadProductos;

public String obtenerTipo(){
    return tipoPedido;
}

public String obtenerLugar(){
    return ubicacion;
}

public String obtenerNombreCliente(){
    return nombreCliente;
}

public String obtenerPrecio(){
    return precio;
}

public ArrayList<String> obtenerProductos(){
    return Productos;
}

public Integer obtenerCantidadDeProductos(){
    return cantidadProductos;
}

public String getLugar() {
	// TODO Auto-generated method stub
	return null;
}

}
