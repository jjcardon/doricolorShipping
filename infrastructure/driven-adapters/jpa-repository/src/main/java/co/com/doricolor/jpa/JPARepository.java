package co.com.doricolor.jpa;

import co.com.doricolor.jpa.entity.ShippingReportEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface JPARepository extends CrudRepository<ShippingReportEntity, String>, QueryByExampleExecutor<ShippingReportEntity> {
    @Query(value = "select Head.TrackingNumber as guia, Destino.city as ciudad, Destino.name as cliente, Concat(Destino.Address1,' ',Destino.Address2) as direccion, Destino.PhoneNum as telefono," +
            "HeadAdi.Number01 as Unidades, HeadAdi.Number02 as Peso_Real, HeadAdi.Number02 as Peso_Volumen, Head.DeclaredAmt as Valor_declarado," +
            "Head.PackNum as embarque, concat('ORDEN: ', Head.OTSOrderNum) as Observaciones " +
            "from ShipHead as Head " +
            "inner join ShipTo AS Destino on Head.ShipToCustNum = Destino.CustNum And Head.ShipToNum = Destino.ShipToNum " +
            "inner join ShipHead_UD As HeadAdi on Head.SysRowID = HeadAdi.ForeignSysRowID " +
            "where Head.TrackingNumber <> ''", nativeQuery = true)
    List<ShippingReportEntity> findAllByShip();
}
