public interface YurtBuilder {
    YurtBuilder setFrameType(String frameTYpe);
    YurtBuilder setDiameter (int diameter);
    YurtBuilder setCovering(String materials);
    YurtBuilder setDoorDirection(String direction);
    YurtBuilder installStove(boolean has_stove);
    YurtBuilder addDecoration(String decoration);
    YurtBuilder setPurpose(YurtPurpose purpose);

    Yurt build();

}
