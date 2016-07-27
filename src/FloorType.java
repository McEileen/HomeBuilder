
public enum FloorType {
    WOOD (4.00F),
    TILE (3.50F),
    CARPET (2.50F);

    public setFloorType(String floorType) {
        switch (floorType.toUpperCase()) {
            case "WOOD":
                return FloorType.WOOD;
                break;
            case "CARPET":
                return FloorType.CARPET;
                break;
            case "TILE":
                return FloorType.TILE;
        }

    }
    private float pricePerSqFt;

    FloorType(float pricePerSqFt) {
        this.pricePerSqFt = pricePerSqFt;
    }

}
