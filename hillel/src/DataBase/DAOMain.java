package DataBase;

import java.util.List;
import java.util.Optional;

/**
 * Created by OGlovatskaya on 14.12.2015.
 */
public class DAOMain {
    public static void main(String[] args) {
        /*ProductDAO productDAO = new ProductDbDAO();

        System.out.println(productDAO.findAll());

        productDAO.create(new Product(4, "Pen", "Accesories", 10));

        System.out.println(productDAO.findById(4));

        productDAO.deleteById(4);*/

        ProductDAO memoryDAO = new ProductMemoryDAO();

        System.out.println(memoryDAO.findAll());

        memoryDAO.create(new Product(4, "Pen", "Accesories", 10));

        System.out.println(memoryDAO.findById(4));

        memoryDAO.deleteById(4);

    }
}
