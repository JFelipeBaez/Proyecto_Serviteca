package dto;

public class Cliente {

    private Long id;
    private String nombre;
    private Integer numeroPedido;
    private Integer cantidadServicios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getnumeroPedidoa() {
        return numeroPedido;
    }

    public void setnumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Integer getcantidadServicios() {
        return cantidadServicios;
    }

    public void setcantidadServicios(Integer cantidadServicios) {
        this.cantidadServicios = cantidadServicios;
    }

    @Override
    public String toString() {
        return this.nombre + ""
                + this.numeroPedido + ""
                + this.cantidadServicios;
    }
}
