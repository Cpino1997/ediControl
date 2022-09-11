package cl.pinolabs.ediControl.model.persistence.mapper;


import cl.pinolabs.ediControl.model.domain.dto.SaludDTO;
import cl.pinolabs.ediControl.model.domain.dto.TrabajadorDTO;
import cl.pinolabs.ediControl.model.persistence.entity.Salud;
import cl.pinolabs.ediControl.model.persistence.entity.Trabajador;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SaludMapper.class, CajaMapper.class, AFPMapper.class})
public interface TrabajadorMapper {
    @Mappings({
    @Mapping(source = "id", target = "idTrabajador"),
    @Mapping(source = "rut", target = "rut"),
    @Mapping(source = "nombre", target = "nombre"),
    @Mapping(source = "apellido", target = "apellido"),
    @Mapping(source = "correo", target = "correo"),
    @Mapping(source = "direccion", target = "direccion"),
    @Mapping(source = "telefono", target = "telefono"),
    @Mapping(source = "cargas", target = "cargas"),
    @Mapping(source = "idAfp", target = "idAfp"),
    @Mapping(source = "afp", target = "afpdto"),
    @Mapping(source = "idSalud", target = "idSalud"),
    @Mapping(source = "salud", target = "saludDTO"),
    @Mapping(source = "idCaja", target = "idCaja"),
    @Mapping(source = "caja", target = "cajaDTO"),
    })
    TrabajadorDTO toTrabajadorDTO(Trabajador trabajador);
    List<TrabajadorDTO> toTrabajadorDTOs(Iterable<Trabajador> trabajadors);
    @InheritInverseConfiguration
    Trabajador toTrabajador(TrabajadorDTO trabajadorDTO);
}
