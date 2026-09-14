public final class Yurt {

    private final String frameType;
    private final int diameter;
    private final String covering;
    private final boolean hasStove;
    private final String purpose;

    Yurt(String frameType, int diameter, String covering, boolean hasStove, String purpose) {
        this.frameType = frameType;
        this.diameter = diameter;
        this.covering = covering;
        this.hasStove = hasStove;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Yurt{frame=" + frameType + ", diameter=" + diameter
                + "m, covering=" + covering + ", stove=" + hasStove
                + ", purpose=" + purpose + "}";
    }
}
