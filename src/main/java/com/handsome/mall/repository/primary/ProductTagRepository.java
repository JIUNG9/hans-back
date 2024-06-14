package com.handsome.mall.repository.primary;

import com.handsome.mall.entity.primary.ProductTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTagRepository extends JpaRepository<ProductTag, Long> {
}
