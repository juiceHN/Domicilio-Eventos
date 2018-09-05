public class RecepcionEvento{
    private Pedido pedido;
    public RecepcionEvento(Pedido pedido){
        this.pedido = pedido;
    }
    ERP ERP = new ERP();
    public void tramitarPedido(){
        String lugares = null;
        boolean personasDisponibles = true;
		if(pedido.obtenerTipo().equals("domicilio")){
			if(lugares.contains(pedido.obtenerLugar())){
				if(personasDisponibles){
                    ERP.operarInventario(pedido.obtenerProductos());
                    ERP.facturar(pedido);
                }else{
                    System.out.println("No hay personas, que lleven adios compañeros");
                }
                    
            }else{
                System.out.println("Empresa no apta, negar pedido");
            }
        }else{
            if(lugares.contains(pedido.getLugar())){
                if(ERP.esAtendible(pedido)){
                    ERP.operarInventario(pedido.obtenerProductos());
                    ERP.facturar(pedido);
                }else{
                    System.out.println("Empresa no apta, negar pedido");
                }
            }else{
                System.out.println("Lugar no aceptable, negar pedido");
            }
        }
    }
    
}
