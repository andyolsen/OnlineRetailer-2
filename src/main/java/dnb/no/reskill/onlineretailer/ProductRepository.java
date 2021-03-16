package dnb.no.reskill.onlineretailer;

import java.util.Collection;

public interface ProductRepository {

        // FROM ANDY: The id isn't known until after insertion. So this method should return the id (or whole Product object).
        void addProduct(Product product);
        
        boolean deleteProduct(int productId);
        boolean updateProduct(Product product);
        Product findProduct(int productId);


}
