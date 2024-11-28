package co.carnage.microcommerce.product.service;

import co.carnage.microcommerce.product.repository.ProductRepository;

import org.springframework.stereotype.Service;hoothootidzhfghezgehuioeuzrgfdyjerkhfrgecfhrceufgrhcjrgfrcegjsgtryjecfgcryejfreugfhrujehfekhf

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById() {
        efiqhezmfoizhefmzeifhmezo
    }

}
