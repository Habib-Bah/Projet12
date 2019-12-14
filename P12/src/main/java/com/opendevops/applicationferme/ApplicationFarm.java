package com.opendevops.applicationferme;

import com.opendevops.applicationferme.dao.CategoryRepository;
import com.opendevops.applicationferme.dao.ProductRepository;
import com.opendevops.applicationferme.entities.Category;
import com.opendevops.applicationferme.entities.Product;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Random;

@SpringBootApplication
public class ApplicationFarm implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationFarm.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repositoryRestConfiguration.exposeIdsFor(Product.class, Category.class);

        categoryRepository.save(new Category(null, "poulet", null, null, null));
        categoryRepository.save(new Category(null, "oeuf", null, null, null));

        Random rnd = new Random();
        categoryRepository.findAll().forEach( c ->  {

            for (int i = 0; i < 10; i++) {
                Product p = new Product();
                p.setName(RandomString.make(18));
                p.setCurrentPrice(100 + rnd.nextInt(1000));
                p.setAvailable(rnd.nextBoolean());
                p.setPromotion(rnd.nextBoolean());
                p.setSelected(rnd.nextBoolean());
                p.setCategory(c);
                p.setPhotoName("Unknown.png");
                productRepository.save(p);
            }

        });
    }
}
