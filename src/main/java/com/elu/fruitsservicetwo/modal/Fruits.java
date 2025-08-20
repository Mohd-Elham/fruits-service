package com.elu.fruitsservicetwo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entity representing a fruit with details such as name,
 * description, quantity, and price.
 */
@Entity
public final class Fruits {

    /**
     * The unique identifier for the fruit.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * The name of the fruit.
     */
    private String name;

    /**
     * The description of the fruit.
     */
    private String description;

    /**
     * The quantity of the fruit.
     */
    private Integer quantity;

    /**
     * The price of the fruit.
     */
    private Double price;

    /**
     * Default constructor.
     */
    public Fruits() {
    }

    /**
     * Parameterized constructor to create a fruit.
     *
     * @param idParam          the fruit ID
     * @param nameParam        the fruit name
     * @param descriptionParam the fruit description
     * @param quantityParam    the fruit quantity
     * @param priceParam       the fruit price
     */
    public Fruits(final Integer idParam, final String nameParam,
                  final String descriptionParam,
                  final Integer quantityParam, final Double priceParam) {
        this.id = idParam;
        this.name = nameParam;
        this.description = descriptionParam;
        this.quantity = quantityParam;
        this.price = priceParam;
    }

    /**
     * Gets the ID of the fruit.
     *
     * @return the fruit ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the ID of the fruit.
     *
     * @param idParam the fruit ID
     */
    public void setId(final Integer idParam) {
        this.id = idParam;
    }

    /**
     * Gets the name of the fruit.
     *
     * @return the fruit name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the fruit.
     *
     * @param nameParam the fruit name
     */
    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    /**
     * Gets the description of the fruit.
     *
     * @return the fruit description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the fruit.
     *
     * @param descriptionParam the fruit description
     */
    public void setDescription(final String descriptionParam) {
        this.description = descriptionParam;
    }

    /**
     * Gets the quantity of the fruit.
     *
     * @return the fruit quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the fruit.
     *
     * @param quantityParam the fruit quantity
     */
    public void setQuantity(final Integer quantityParam) {
        this.quantity = quantityParam;
    }

    /**
     * Gets the price of the fruit.
     *
     * @return the fruit price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the price of the fruit.
     *
     * @param priceParam the fruit price
     */
    public void setPrice(final Double priceParam) {
        this.price = priceParam;
    }
}
