package Application;
import Domain.PizzaType;
import Repository.PizzaRepository;

import java.util.List;

public class PizzaService {

    private final PizzaRepository repository;

    public PizzaService(PizzaRepository Repository) {this.repository = Repository;}

    public PizzaType getPizzaType(int id) {return repository.findById(id);}
    public PizzaType getPizzaType(PizzaType pizzaType) {return repository.save(pizzaType);}
    public PizzaType updatePizzaType(PizzaType pizzaType) {return repository.save(pizzaType);}
    public PizzaType deletePizzaType (int id) {
        repository.deleteById(id);
        return null;
    }
    public List<PizzaType> getPizzaTypes() {return repository.findAll();}
}
