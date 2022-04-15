package br.com.dh.ctd.ecommerce.util;

import br.com.dh.ctd.ecommerce.repository.CategoryRepository;
import br.com.dh.ctd.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Seeding {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public Seeding(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public void run(ApplicationArguments args) {

    }
}
