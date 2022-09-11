package cl.pinolabs.ediControl.model.persistence.mapper;

import cl.pinolabs.ediControl.model.domain.dto.SaludDTO;
import cl.pinolabs.ediControl.model.persistence.entity.Salud;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SaludMapper {
    @Mappings({
            @Mapping(source = "id", target = "idSalud"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "descuento", target = "descuento"),
    })
    SaludDTO toSaludDTO(Salud salud);
    List<SaludDTO> toSaludDTOs(Iterable<Salud> saluds);
    @InheritInverseConfiguration
    Salud toSalud(SaludDTO saludDTO);
}

