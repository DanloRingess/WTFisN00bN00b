package org.academiadecodigo.simplegraphics.graphics;

/**
 * Methods for filling a shape
 */
public interface Fillable {

    /**
     * Paints the shape with the current shape color
     */
    void fill();

    /**
     * Gets if the shape is painted
     * @return true if the shape if painted
     */
    boolean isFilled();

}
