package heroku.superkiddos.service;
import heroku.superkiddos.entity.Producto;
import heroku.superkiddos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto>list(){
        return productoRepository.findAll();
    }
    public Optional<Producto>getOne(int id){
        return productoRepository.findById(id);
    }
    public Optional<Producto>getByNombre(String nombre){
        return productoRepository.findByNombre(nombre);
    }
    public void save(Producto producto){
        productoRepository.save(producto);
    }
    public void delete(int id ){
        productoRepository.deleteById(id);
    }
    public boolean existeById(int id){
        return productoRepository.existsById(id);
    }
    public boolean existeByNombre(String nombre){
        return productoRepository.existsByNombre(nombre);
    }


}
