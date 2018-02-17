package org.academiadecodigo.simplegraphics.mouse;

/**
 * Mouse event containing x and y coordinates
 */
public class MouseEvent {

    private double x;
    private double y;

    private MouseEventType eventType;

    /**
     * Gets the X coordinate of the mouse
     * @return the x coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the Y coordinate of the mouse
     * @return the y coordinate
     */
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public MouseEvent(double x, double y, MouseEventType eventType) {
        this.x = x;
        this.y = y;
        this.eventType = eventType;
    }

    public MouseEventType getEventType() {
        return eventType;
    }

    @Override
    public String toString() {
        return "MouseEvent{" +
                "x=" + x +
                ", y=" + y +
                ", eventType=" + eventType +
                '}';
    }

}
