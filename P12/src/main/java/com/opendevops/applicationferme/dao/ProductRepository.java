package com.opendevops.applicationferme.dao;

import com.opendevops.applicationferme.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    @RestResource(path = "/selectedProduct")
    public List<Product> findBySelectedIsTrue();

    @RestResource(path = "/productByKeyword")
    public List<Product> findByNameContains(@Param("mc") String mc);

    @RestResource(path = "/promoProducts")
    public List<Product> findByPromotionIsTrue();

    @RestResource(path = "/dispoProducts")
    public List<Product> findByAvailableIsTrue();
}
