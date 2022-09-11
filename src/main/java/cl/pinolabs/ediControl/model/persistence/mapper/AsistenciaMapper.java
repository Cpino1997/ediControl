package cl.pinolabs.ediControl.model.persistence.mapper;

import cl.pinolabs.ediControl.model.domain.dto.AsistenciaDTO;
import cl.pinolabs.ediControl.model.domain.dto.ContratoDTO;
import cl.pinolabs.ediControl.model.persistence.entity.Asistencia;
import cl.pinolabs.ediControl.model.persistence.entity.Contrato;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TrabajadorMapper.class})
public interface AsistenciaMapper {
    @Mappings({
            @Mapping(source = "id", target = "idAsistencia"),
            @Mapping(source = "diasAsistidos", target = "diasAsistidos"),
            @Mapping(source = "diasFaltados", target = "diasFaltados"),
            @Mapping(source = "horasTrabajadas", target = "horasTrabajadas"),
            @Mapping(source = "idTrabajador", target = "idTrabajador"),
            @Mapping(source = "trabajador", target = "trabajadorDTO"),

    })
    AsistenciaDTO toAsistenciaDTO(Asistencia asistencia);
    List<AsistenciaDTO> toAsistenciaDTOs(Iterable<Asistencia> asistencias);
    @InheritInverseConfiguration
    Asistencia toAsistencia(AsistenciaDTO asistenciaDTO);
}
