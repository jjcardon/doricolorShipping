package co.com.doricolor.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ShippingReportEntity {
    @Id
    @Column(name = "guia") private String guia;
    @Column(name = "ciudad") private String ciudadDestino;
    @Column(name = "cliente") private String destinatario;
    @Column(name = "direccion") private String direccion;
    @Column(name = "telefono") private String telefono;
    @Column(name = "unidades") private Long unidades;
    @Column(name = "peso_real") private Long pesoReal;
    @Column(name = "peso_volumen") private Long pesoVolumen;
    @Column(name = "valor_declarado") private Double valorDeclarado;
    @Column(name = "embarque") private String referencia;
    @Column(name = "observaciones") private String observaciones;
}
