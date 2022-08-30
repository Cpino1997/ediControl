package cl.pinolabs.ediControl.model.domain.service;

import cl.pinolabs.ediControl.model.domain.dto.AFPDTO;
import cl.pinolabs.ediControl.model.domain.dto.Rol;
import cl.pinolabs.ediControl.model.domain.dto.User;
import cl.pinolabs.ediControl.model.domain.repository.AFPDTORepo;
import cl.pinolabs.ediControl.model.domain.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AFPService {
    private final AFPDTORepo repo;

    public AFPService(AFPDTORepo repo) {
        this.repo = repo;
    }
    public Optional<List<AFPDTO>> findAll(){
        return repo.findAll();
    }

    public Optional<AFPDTO> findById(int idAfp){
        return repo.findById(idAfp);
    }

    public AFPDTO save(AFPDTO afpdto){
        return repo.save(afpdto);
    }

    public boolean delete(int idAfp){
        return findById(idAfp)
                .map(afpdto -> {
                    repo.delete(idAfp);
                    return true;})
                .orElse(false);
    }
}
