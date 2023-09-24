package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    //@Override
    public void add(Product product) {
        ProductDao.add(product);
    }

    @Override
    public void Add(Product product) {

    }


}

