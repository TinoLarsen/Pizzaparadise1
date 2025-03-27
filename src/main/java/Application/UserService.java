package Application;

import Domain.User;
import Repository.UserRepository;

import java.util.List;


public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {this.repository = repository;}

    public User getUser(int id) {
        return repository.findById(id);
    }
    public User createUser(User user) {
        return repository.save(user);
    }
    public User updateUser(User user) {
        return repository.save(user);
    }
    public void deleteUser(int id) {
        repository.deletebyid(id);
    }
    public List<User> getAllUsers() {
        return repository.findAll();
    }

}
