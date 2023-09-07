package com.api.repo;

import com.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author im_na
 */
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
