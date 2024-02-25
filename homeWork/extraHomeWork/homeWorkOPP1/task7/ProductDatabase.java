package homeWorkOPP1.task7;

public interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}
