package co.com.doricolor.model.shippingreport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class ShippingReport {
    private String guia;
    private String ciudadDestino;
    private String destinatario;
    private String direccion;
    private String telefono;
    private Long unidades;
    private Long pesoReal;
    private Long pesoVolumen;
    private Double valorDeclarado;
    private String referencia;
    private String observaciones;

}
