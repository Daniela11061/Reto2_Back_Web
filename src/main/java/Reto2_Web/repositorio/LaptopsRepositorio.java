package Reto2_Web.repositorio;
import Reto2_Web.interfaces.InterfaceLaptops;
import Reto2_Web.modelo.Laptops;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Daniela
 */
@Repository
public class LaptopsRepositorio {
    @Autowired
    private InterfaceLaptops repository;
    public List<Laptops> getAll() {
        return repository.findAll();
    }
    public Optional<Laptops> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Laptops create(Laptops clothe) {
        return repository.save(clothe);
    }
    public void update(Laptops clothe) {
        repository.save(clothe);
    }
    public void delete(Laptops clothe) {
        repository.delete(clothe);
    }
}
