package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet,Long> {

    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
