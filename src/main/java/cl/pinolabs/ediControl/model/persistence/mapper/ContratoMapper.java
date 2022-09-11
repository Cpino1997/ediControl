package cl.pinolabs.ediControl.model.persistence.mapper;

import cl.pinolabs.ediControl.model.domain.dto.ContratoDTO;
import cl.pinolabs.ediControl.model.persistence.entity.Contrato;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {HorarioMapper.class,TrabajadorMapper.class})
public interface ContratoMapper {

    @Mappings({
            @Mapping(source = "id", target = "idContrato"),
            @Mapping(source = "inicioContrato", target = "inicioContrato"),
            @Mapping(source = "terminoContrato", target = "terminoContrato"),
            @Mapping(source = "idHorario", target = "idHorario"),
            @Mapping(source = "horario", target = "horarioDTO"),
            @Mapping(source = "idTrabajador", target = "idTrabajador"),
            @Mapping(source = "trabajador", target = "trabajadorDTO"),

    })
    ContratoDTO toContratoDTO(Contrato contrato);
    List<ContratoDTO> toContratoDTOs(Iterable<Contrato> contratos);
    @InheritInverseConfiguration
    Contrato toContrato(ContratoDTO contratoDTO);
}
