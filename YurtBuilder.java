import java.util.Set;

public class YurtBuilder {

    private static final int MIN_DIAMETER = 4;
    private static final int MAX_DIAMETER = 12;
    private static final Set<String> VALID_PURPOSES =
            Set.of("NOMADIC", "TOURIST", "CEREMONIAL");

    private String frameType;
    private int diameter;
    private String covering;
    private boolean hasStove;
    private String purpose;

    public YurtBuilder setFrameType(String frameType) {
        this.frameType = frameType;
        return this;
    }

    public YurtBuilder setDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    public YurtBuilder setCovering(String covering) {
        this.covering = covering;
        return this;
    }

    public YurtBuilder installStove(boolean hasStove) {
        this.hasStove = hasStove;
        return this;
    }

    public YurtBuilder setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    public Yurt build() {
        if (frameType == null) {
            throw new IllegalStateException("Frame type is required.");
        }
        if (diameter < MIN_DIAMETER || diameter > MAX_DIAMETER) {
            throw new IllegalStateException(
                    "Diameter must be between " + MIN_DIAMETER + " and " + MAX_DIAMETER + ".");
        }
        if (covering == null) {
            throw new IllegalStateException("Covering is required.");
        }
        if (purpose == null || !VALID_PURPOSES.contains(purpose)) {
            throw new IllegalStateException("Purpose must be one of: " + VALID_PURPOSES);
        }
        return new Yurt(frameType, diameter, covering, hasStove, purpose);
    }
}
