package com.SearchNest.SearchNest.service;
import com.SearchNest.SearchNest.entity.Product;
import com.SearchNest.SearchNest.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepo  productRepo;

    public Iterable<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }

//    public Product updateProduct(Product product, int id) {
//        Product product1  = productRepo.findById(id).get();
//        product1.setPrice(product.getPrice());
//        return product1;
//    }

    public void deleteProduct(int id ) {
        productRepo.deleteById(id);
    }

}