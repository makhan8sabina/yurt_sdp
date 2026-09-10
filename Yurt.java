import java.util.Collections;
import java.util.List;

public final class Yurt {

    private final String frameType;
    private final int diameterMeters;
    private final String coveringMaterial;
    private final String doorDirection;
    private final boolean has_stove;
    private final List<String> decorations;
    private final YurtPurpose purpose;

    Yurt(String frameType,
         int diameterMeters,
         String coveringMaterial,
         String doorDirection,
         boolean has_stove,
         List<String> decorations,
         YurtPurpose purpose){
        this.frameType=frameType;
        this.diameterMeters=diameterMeters;
        this.coveringMaterial=coveringMaterial;
        this.doorDirection=doorDirection;
        this.has_stove=has_stove;
        this.decorations=Collections.unmodifiableList(decorations);
        this.purpose=purpose;
    }
    public String getFrameType() {
        return frameType;
    }
    public int getDiameterMeters(){
        return diameterMeters;
    }
    public String getCoveringMaterial(){
        return coveringMaterial;
    }
    public String getDoorDirection(){
        return doorDirection;
    }
    public boolean hasStove(){
        return has_stove;
    }
    public List<String> getDecorations(){
        return decorations;
    }
    public YurtPurpose getPurpose(){
        return purpose;
    }
    @Override
    public String toString(){
        return "Yurt{" +
                "purpose=" + purpose +
                ", frameType='" + frameType + '\'' +
                ", diameterMeters=" + diameterMeters +
                ", coveringMaterial='" + coveringMaterial + '\'' +
                ", doorDirection='" + doorDirection + '\'' +
                ", has_stove=" + has_stove +
                ", decorations=" + decorations +
                '}';
    }
}
