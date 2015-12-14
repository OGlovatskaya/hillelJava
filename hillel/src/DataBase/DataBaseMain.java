package DataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by OGlovatskaya on 10.12.2015.
 */
public class DataBaseMain {

    public static void main(String[] args) throws SQLException {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        String connectionString = "jdbc:postgresql://localhost:5433/postgres";

        Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres");

        //notCorrectUpdate(connection);

        //correctUpdate(connection);

        //create(connection, new Product(1, "Table", "Furniture", 100));


        /*ResultSet resultSet = read2(connection);

        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");

        }

        resultSet.close();*/

        //deleteById(connection, 1);



        Optional<Product> possibleProduct = findById(connection, 1);
        if (possibleProduct.isPresent()){
            System.out.println("product in optional: " + possibleProduct.get());
        }


        System.out.println(findAll(connection));
        connection.close();
    }

    /*private static ResultSet read2(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "SELECT id as item_id, name, category, price FROM store";
        return statement.executeQuery(sql);
    }*/

    private static void deleteById(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM store WHERE id = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    private static void create(Connection connection, Product product) throws SQLException {
        String sql = "INSERT INTO store (id, name, category, price) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, product.getId());
        statement.setString(2, product.getName());
        statement.setString(3, product.getCategory());
        statement.setInt(4, product.getPrice());

        statement.executeUpdate();
        statement.close();
    }

    private static void correctUpdate(Connection connection) throws SQLException {
        String sql = "UPDATE store SET name = ? WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "KEYBOARD'--");
        preparedStatement.setInt(2, 1);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    private static void notCorrectUpdate(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String newName = "KEYBOARD";
        //String newName = "KEYBOARD'--"; - obnovliautsia vse dannie v etoi tablice
        int id = 1;
        String sql = "UPDATE store SET name = '" + newName + "' WHERE id = " + id;

        int rowsUpdate = statement.executeUpdate(sql);
        System.out.println("row update: " + rowsUpdate);
    }

    private static List<Product> findAll(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sgl = "SELECT id as item_id, name, category, price FROM store";

        ResultSet resultSet = statement.executeQuery(sgl);
        List<Product> products = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("item_id");
            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");

            Product product = new Product(id, name, category, price);
            products.add(product);
        }
        resultSet.close();

        return products;
    }

    private static Optional<Product> findById(Connection connection, int id) throws SQLException {

        String sql = "SELECT name, category, price FROM store WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();
        Optional<Product> product = Optional.empty();

        if (resultSet.next()) {

            String name = resultSet.getString("name");
            String category = resultSet.getString("category");
            int price = resultSet.getInt("price");

            product = Optional.of(new Product(id, name, category, price));
        }
        resultSet.close();
        return product;
    }

}
