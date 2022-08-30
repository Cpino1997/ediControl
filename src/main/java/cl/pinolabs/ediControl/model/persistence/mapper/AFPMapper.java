package cl.pinolabs.ediControl.model.persistence.mapper;

import cl.pinolabs.ediControl.model.domain.dto.AFPDTO;
import cl.pinolabs.ediControl.model.persistence.entity.AFP;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AFPMapper {
    @Mappings({
            @Mapping(source = "id", target = "idAfp"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "descuento", target = "descuento"),
    })
    AFPDTO toAFPDTO(AFP afp);
    List<AFPDTO> toAFPDTOs(Iterable<AFP> afps);
    @InheritInverseConfiguration
    AFP toAFP(AFPDTO afpdto);
}
