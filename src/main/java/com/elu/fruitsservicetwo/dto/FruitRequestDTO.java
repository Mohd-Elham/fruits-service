package com.elu.fruitsservicetwo.dto;

public class FruitRequestDTO {

    /**
     * The name of the fruit.
     */
    private String fruitName;

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
    public FruitRequestDTO() {
    }

    /**
     * Parameterized constructor to create a fruit request.
     *
     * @param fruitNameParam   the fruit name
     * @param descriptionParam the fruit description
     * @param quantityParam    the fruit quantity
     * @param priceParam       the fruit price
     */
    public FruitRequestDTO(final String fruitNameParam,
                           final String descriptionParam,
                           final Integer quantityParam,
                           final Double priceParam) {
        this.fruitName = fruitNameParam;
        this.description = descriptionParam;
        this.quantity = quantityParam;
        this.price = priceParam;
    }

    /**
     * Returns a string representation of the FruitRequestDTO.
     * <p>
     * Subclasses overriding this method should call {@code super.toString()}
     * to include base class properties.
     * </p>
     *
     * @return string representation of this DTO
     */
    @Override
    public String toString() {
        return "FruitRequestDTO{"
                + "fruitName='" + fruitName + '\''
                + ", description='" + description + '\''
                + ", quantity=" + quantity
                + ", price=" + price
                + '}';
    }

    /**
     * Gets the fruit name.
     *
     * @return the fruit name
     */
    public String getFruitName() {
        return fruitName;
    }

    /**
     * Sets the fruit name.
     *
     * @param fruitNameParam the fruit name to set
     */
    public void setFruitName(final String fruitNameParam) {
        this.fruitName = fruitNameParam;
    }

    /**
     * Gets the fruit description.
     *
     * @return the fruit description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the fruit description.
     *
     * @param descriptionParam the description to set
     */
    public void setDescription(final String descriptionParam) {
        this.description = descriptionParam;
    }

    /**
     * Gets the fruit quantity.
     *
     * @return the fruit quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the fruit quantity.
     *
     * @param quantityParam the quantity to set
     */
    public void setQuantity(final Integer quantityParam) {
        this.quantity = quantityParam;
    }

    /**
     * Gets the fruit price.
     *
     * @return the fruit price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the fruit price.
     *
     * @param priceParam the price to set
     */
    public void setPrice(final Double priceParam) {
        this.price = priceParam;
    }


}
