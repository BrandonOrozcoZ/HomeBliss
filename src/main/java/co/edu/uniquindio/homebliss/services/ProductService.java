package co.edu.uniquindio.homebliss.services;

import co.edu.uniquindio.homebliss.dto.ProductDTO;
import co.edu.uniquindio.homebliss.dto.ProductGetDTO;
import co.edu.uniquindio.homebliss.model.Category;
import co.edu.uniquindio.homebliss.model.Product;
import co.edu.uniquindio.homebliss.model.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public interface ProductService {

    int createProduct(ProductDTO productDTO);

    int updateProduct(int productCode, ProductDTO productDTO);

    int deleteProduct(int productCode);

    ProductGetDTO getProduct(int productCode);

    List<ProductGetDTO> getUserProducts(int userCode);

    List<ProductGetDTO> getProductsByCategory(Category category);

    List<ProductGetDTO> getProductsByState(State state);

    List<ProductGetDTO> getFavoritesProducts(int userCode);

    List<ProductGetDTO> getProductsByName(String name);

    List<ProductGetDTO> getProductsByPrice(float minPrice, float maxPrice);

}
