package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    //import oopWithNLayeredApp.entities.Product;


        public void add(Product product) {
            System.out.println("Hibernate ile veritabanına eklendi");
        }

    @Override
    public void Add(Product product) {

    }
}

