package bike.reto3.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bike.reto3.modelo.Cliente;
import bike.reto3.repositorio.Crud.ClienteCrudRepositorio;

/**
 *
 * @author Juan
 */
@Repository
public class ClienteRepositorio {
    @Autowired
    private ClienteCrudRepositorio crud1;

    public List<Cliente> getAll() {
        return (List<Cliente>) crud1.findAll();
    }

    public Optional<Cliente> getCliente(int id) {
        return crud1.findById(id);
    }

    public Cliente save(Cliente cliente) {
        return crud1.save(cliente);
    }

    public void delete(Cliente cliente) {
        crud1.delete(cliente);
    }

}
