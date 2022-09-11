package cl.pinolabs.ediControl.model.persistence.mapper;

import cl.pinolabs.ediControl.model.domain.dto.HorarioDTO;
import cl.pinolabs.ediControl.model.persistence.entity.Horario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HorarioMapper {
    @Mappings({
            @Mapping(source = "id", target = "idHorario"),
            @Mapping(source = "horario", target = "horario"),
            @Mapping(source = "horaSemanal", target = "horaSemanal"),
            @Mapping(source = "sueldo", target = "sueldo"),
    })
    HorarioDTO toHorarioDTO(Horario horario);
    List<HorarioDTO> toHorarioDTOs(Iterable<Horario> horarios);
    @InheritInverseConfiguration
    Horario toHorario(HorarioDTO horarioDTO);
}
