package Application;

import Domain.Ordre;
import Repository.OrdreRepository;
import Repository.PizzaRepository;

import java.util.List;

public class OrdreService {

    private final OrdreRepository repository;

    public OrdreService(OrdreRepository repository) {this.repository = repository;}

    public Ordre getOrdre(int id) {return repository.findById(id);}
    public Ordre CreateOrdre(Ordre ordre){return repository.save(ordre);}
    public Ordre UpdateOrdre(Ordre ordre){return repository.save(ordre);}
    public void DeleteOrdre(int id) {repository.deleteById(id);}
    public List<Ordre> getAllOrdres() {return repository.findAll();}




}
