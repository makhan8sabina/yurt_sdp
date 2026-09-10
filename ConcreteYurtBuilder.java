import java.util.ArrayList;
import java.util.List;

public class ConcreteYurtBuilder implements YurtBuilder{
    private String frameType;
    private int diameterMeters;
    private String coveringMaterial;
    private String doorDirection;
    private boolean has_stove;
    private final List<String> decorations=new ArrayList<>();
    private YurtPurpose purpose;

    @Override
    public YurtBuilder setFrameType(String frameType) {
        this.frameType = frameType;
        return this;
    }

    @Override
    public YurtBuilder setDiameter(int meters) {
        this.diameterMeters = meters;
        return this;
    }

    @Override
    public YurtBuilder setCovering(String material) {
        this.coveringMaterial=material;
        return this;
    }

    @Override
    public YurtBuilder setDoorDirection(String direction) {
        this.doorDirection=direction;
        return this;
    }

    @Override
    public YurtBuilder installStove(boolean hasStove) {
        this.has_stove=has_stove;
        return this;
    }

    @Override
    public YurtBuilder addDecoration(String decoration) {
        this.decorations.add(decoration);
        return this;
    }

    @Override
    public YurtBuilder setPurpose(YurtPurpose purpose) {
        this.purpose=purpose;
        return this;
    }

    @Override
    public Yurt build() {
        validateFrame();
        validateDiameter();
        validateCovering();
        validatePurpose();

        return new Yurt(frameType, diameterMeters, coveringMaterial,
                doorDirection, has_stove, decorations, purpose);
    }

    private void validateFrame() {
        if (frameType == null || frameType.isBlank()) {
            throw new IllegalStateException("A yurt cannot be built without a frame type.");
        }
    }

    private void validateDiameter() {
        if (diameterMeters < YurtConstants.MIN_DIAMETER_METERS
                || diameterMeters > YurtConstants.MAX_DIAMETER_METERS) {
            throw new IllegalStateException(
                    "Diameter must be between " + YurtConstants.MIN_DIAMETER_METERS
                            + " and " + YurtConstants.MAX_DIAMETER_METERS
                            + " meters, but was " + diameterMeters + ".");
        }
    }

    private void validateCovering() {
        if (coveringMaterial==null || coveringMaterial.isBlank()) {
            throw new IllegalStateException("A yurt cannot be built without a covering material.");
        }
    }

    private void validatePurpose() {
        if (purpose==null) {
            throw new IllegalStateException("A yurt must have a declared purpose.");
        }
    }

}
