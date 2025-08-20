package com.elu.fruitsservicetwo.controller;

import com.elu.fruitsservicetwo.dto.FruitRequestDTO;
import com.elu.fruitsservicetwo.service.FruitServiceImpl;
import com.elu.fruitsservicetwo.modal.Fruits;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


/**
 * Controller for managing fruit operations.
 */
@RestController
@RequestMapping("/fruit")
public class FruitController {

    /**
     * Service implementation for handling fruit-related operations.
     */
    private final FruitServiceImpl fruitServiceImpl;


    /**
     * @param serviceImpl
     */
    public FruitController(final FruitServiceImpl serviceImpl) {
        this.fruitServiceImpl = serviceImpl;
    }


    /**
     * Gets the list of all fruits.
     *
     * @return list of fruits or message if none available
     */
    @GetMapping("/listFruits")
    public ResponseEntity<?> listFruits() {
        try {
            List<Fruits> fruitsList = fruitServiceImpl.getListOfFruits();
            return new ResponseEntity<>(fruitsList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("no fruits availeble", HttpStatus.OK);
        }
    }

    /**
     * Default fruit price.
     */
    private static final double DEFAULT_FRUIT_PRICE = 100.0;

    /**
     * Default fruit quantity.
     */
    private static final int DEFAULT_FRUIT_QUANTITY = 10;

    /**
     * Test endpoint to insert a sample fruit.
     *
     * @return success or error message
     */
    @GetMapping("/test")
    public ResponseEntity<?> test() {
        try {
            Fruits newFruit = new Fruits();
            newFruit.setName("Apple");
            newFruit.setDescription("Veryy red appe friuit");
            newFruit.setPrice(DEFAULT_FRUIT_PRICE);
            newFruit.setQuantity(DEFAULT_FRUIT_QUANTITY);

            fruitServiceImpl.saveFruits(newFruit);

            return new ResponseEntity<>("saved", HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("no fruits availeble", HttpStatus.OK);
        }
    }

    /**
     * Adds a new fruit based on request body.
     *
     * @param request request body containing fruit details
     * @return success or error response
     */
    @PostMapping("/addFruit")
    public ResponseEntity<?> addFruit(@RequestBody final
                                          FruitRequestDTO request) {
        try {
            fruitServiceImpl.addFruits(request);
            return new ResponseEntity<>("fruit has been added succefully",
                    HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.CREATED);
        }
    }

}
