package com.elu.fruitsservicetwo.service;

import com.elu.fruitsservicetwo.dto.FruitRequestDTO;
import com.elu.fruitsservicetwo.modal.Fruits;
import org.springframework.stereotype.Service;
import com.elu.fruitsservicetwo.repo.FruitsRepo;

import java.util.List;

/**
 * Service implementation for fruit operations.
 */
@Service
public final class FruitService implements FruitServiceImpl {

    /**
     * Repository for fruit persistence operations.
     */
    private final FruitsRepo fruitsRepo;

    /**
     * Constructor injection for the fruit repository.
     *
     * @param repo the fruits repository
     */
    public FruitService(final FruitsRepo repo) {
        this.fruitsRepo = repo;
    }

    /**
     * Gets the list of all fruits.
     *
     * @return list of fruits
     */
    public List<Fruits> getListOfFruits() {
        return fruitsRepo.findAll();
    }

    /**
     * Saves a fruit entity.
     *
     * @param fruits the fruit entity to save
     */
    @Override
    public void saveFruits(final Fruits fruits) {
        // In production, replace with logger
        System.out.println("INSIDE FruitService saveFruits " + fruits);
        fruitsRepo.save(fruits);
    }

    /**
     * Adds a new fruit from a DTO request.
     *
     * @param request the fruit request DTO
     */
    @Override
    public void addFruits(final FruitRequestDTO request) {
        Fruits fruits = new Fruits();
        fruits.setName(request.getFruitName());
        fruits.setPrice(request.getPrice());
        fruits.setDescription(request.getDescription());
        fruits.setQuantity(request.getQuantity());
        fruitsRepo.save(fruits);
    }
}
