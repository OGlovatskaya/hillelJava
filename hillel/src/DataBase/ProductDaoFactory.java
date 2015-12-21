package DataBase;

/**
 * Created by OGlovatskaya on 21.12.2015.
 */
public class ProductDaoFactory {

    public static ProductDAO createDAO(String daoType) {
        ProductDAO productDAO;
        switch (daoType) {
            case "db":
                productDAO = new ProductXMLDAO();
                break;
            case "memory":
                productDAO = new ProductMemoryDAO();
                break;
            case "xml":
                productDAO = new ProductXMLDAO();
                break;
            default:
                System.out.println("expected db, memory, xml but found" + daoType);
                productDAO = new ProductMemoryDAO();
        }
        return productDAO;
    }
}
