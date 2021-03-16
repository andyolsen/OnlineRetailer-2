package dnb.no.reskill.onlineretailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;


    @Override
    public void addToStock(Product product) {
        repository.addProduct(product);

    }

    @Override
    public void deleteFromStock(int productId) {
        repository.deleteProduct(productId);

    }

    @Override
    public void updateStock(Product product) {
        repository.updateProduct(product);

    }

    @Override
    public Product findInStock(int productId) {
        return repository.findProduct(productId);
    }


}
