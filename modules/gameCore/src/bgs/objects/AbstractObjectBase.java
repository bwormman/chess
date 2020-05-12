package bgs.objects;

import bgs.area.IArea;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

/**
 * @author Roman
 */
public abstract class AbstractObjectBase {

    protected int lastPosition;

    protected int squareNumber;

    protected Color color;

    public AbstractObjectBase(int squareNumber, Color color) {
        this.squareNumber = squareNumber;
        this.color = color;
    }

    public boolean isInRange(int SquareNumber, @NotNull IArea area) {
        return area.isValidSquareNumber(SquareNumber) && area.getObjectFromList(SquareNumber) == null;
    }

    public boolean isActionable(int SquareNumber, @NotNull IArea area) {
        return area.isValidSquareNumber(SquareNumber);
    }

    public int getSquareNumber() {
        return this.squareNumber;
    }

    public Color getColor() {
        return this.color;
    }

    public int getLastPosition() {
        return this.lastPosition;
    }

    public abstract boolean move(int SquareNumber, IArea area);

    public abstract boolean action(int SquareNumber, IArea area);
}