package com.example.inventory_service.service;

import com.example.inventory_service.repo.InventoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepo inventoryRepo;

    private final InventoryService inventoryService;

    public boolean isInStock(String skuCode, Integer quantity) {
        return inventoryRepo.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
