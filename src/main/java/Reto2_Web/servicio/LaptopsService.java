package Reto2_Web.servicio;
import Reto2_Web.modelo.Laptops;
import Reto2_Web.repositorio.LaptopsRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Daniela
 */
@Service
public class LaptopsService {
     @Autowired
    private LaptopsRepositorio clotheRepository;
    public List<Laptops> getAll() {
        return clotheRepository.getAll();
    }
   public Optional<Laptops> getClothe(String reference) {
        return clotheRepository.getClothe(reference);
    }
    public Laptops create(Laptops accesory) {
        if (accesory.getReference() == null) {
            return accesory;
        } else {
            return clotheRepository.create(accesory);
        }
    }
    public Laptops update(Laptops accesory) {
        if (accesory.getReference() != null) {
            Optional<Laptops> accesoryDb = clotheRepository.getClothe((String) accesory.getReference());
            if (!accesoryDb.isEmpty()) {
                if (accesory.getBrand()!= null) {
                    accesoryDb.get().setBrand(accesory.getBrand());
                }
                if (accesory.getCategory() != null) {
                    accesoryDb.get().setCategory(accesory.getCategory());
                }
                if (accesory.getDescription() != null) {
                    accesoryDb.get().setDescription(accesory.getDescription());
                }
                if (accesory.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(accesory.getPrice());
                }
                if (accesory.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(accesory.getQuantity());
                }
                if (accesory.getPhotography() != null) {
                    accesoryDb.get().setPhotography(accesory.getPhotography());
                }
                accesoryDb.get().setAvailability(accesory.isAvailability());
                clotheRepository.update(accesoryDb.get());
                return accesoryDb.get();
            } else {
                return accesory;
            }
        } else {
            return accesory;
        }
    }
    public boolean delete(String reference) {
        Boolean aBoolean = getClothe(reference).map(accesory -> {
            clotheRepository.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    } 
}
