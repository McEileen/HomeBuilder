
public class Floor implements Calculable {
    private int length;
    private int width;
    private enum FloorType;

    public Floor(int length, int width, String floorType) {
        this.length = length;
        this.width = width;
        this.FloorType = FloorType.setFloorType(floorType);

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSqFootage() {
        return this.getWidth() * this.getLength();
    }

    public int getTotalPrice() {
        return this.getSqFootage() * FloorType
    }
}
