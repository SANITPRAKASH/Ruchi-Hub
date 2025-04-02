package com.nanu.ruchihub.repository;

import com.nanu.ruchihub.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
