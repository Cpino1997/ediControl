package cl.pinolabs.ediControl.model.domain.repository;

import cl.pinolabs.ediControl.model.domain.dto.Rol;

import java.util.List;
import java.util.Optional;

public interface RolRepository {
    Optional<List<Rol>> findAll();
    Optional<Rol> findById(int rolId);
    Optional<Rol> findByRolName(String rolName);
    Rol save(Rol rol);
    void delete(int rolId);
}