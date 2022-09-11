package cl.pinolabs.ediControl.model.persistence.mapper;

import cl.pinolabs.ediControl.model.domain.dto.HorarioDTO;
import cl.pinolabs.ediControl.model.domain.dto.ParticipanteDTO;
import cl.pinolabs.ediControl.model.persistence.entity.Horario;
import cl.pinolabs.ediControl.model.persistence.entity.Participante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParticipanteMapper {
    @Mappings({
            @Mapping(source = "id", target = "idParticipante"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "correo", target = "correo"),
            @Mapping(source = "uso", target = "uso"),
    })
    ParticipanteDTO toParticipanteDTO(Participante participante);
    List<ParticipanteDTO> toParticipanteDTOs(Iterable<Participante> participantes);
    @InheritInverseConfiguration
    Participante toParticipante(ParticipanteDTO participanteDTO);
}
