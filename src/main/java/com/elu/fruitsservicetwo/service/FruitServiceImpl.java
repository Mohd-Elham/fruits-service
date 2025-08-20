package com.elu.fruitsservicetwo.service;

import com.elu.fruitsservicetwo.dto.FruitRequestDTO;
import com.elu.fruitsservicetwo.modal.Fruits;

import java.util.List;


public interface FruitServiceImpl {
    /**
     * Get a list of all fruits.
     *
     * @return list of fruits
     */
    List<Fruits> getListOfFruits();

    /**
     * Save a fruit entity.
     *
     * @param fruits the fruit to save
     */
    void saveFruits(Fruits fruits);

    /**
     * Add a fruit using DTO.
     *
     * @param request the fruit request DTO
     */
    void addFruits(FruitRequestDTO request);
}
