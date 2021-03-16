package dnb.no.reskill.onlineretailer;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class ProductRepositoryImpl implements ProductRepository {


    private HashMap<Integer, Product> stock = new HashMap();



    @Override
    public void addProduct(Product product) {
        stock.put(product.getId(), product);
        System.out.println("Added to stock");
    }

    @Override
    public boolean deleteProduct(int productId) {
        stock.remove(productId);
        if (!stock.containsKey(productId)){
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean updateProduct(Product product) {
        stock.replace(product.getId(), product);
        return true;
    }


    @Override
    public Product findProduct(int productId) {
        return stock.get(productId);
    }


}
