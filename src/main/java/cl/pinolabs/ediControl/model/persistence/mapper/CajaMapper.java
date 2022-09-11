package cl.pinolabs.ediControl.model.persistence.mapper;

import cl.pinolabs.ediControl.model.domain.dto.CajaDTO;
import cl.pinolabs.ediControl.model.persistence.entity.Caja;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CajaMapper {
    @Mappings({
            @Mapping(source = "id", target = "idCaja"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "descuento", target = "descuento"),
    })
    CajaDTO toCajaDTO(Caja caja);
    List<CajaDTO> toCajaDTOs(Iterable<Caja> cajas);
    @InheritInverseConfiguration
    Caja toCaja(CajaDTO cajaDTO);
}
