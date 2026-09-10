public class YurtDirector {

    public Yurt constructTraditionalNomadicYurt(YurtBuilder builder) {
        return builder
                .setFrameType(YurtConstants.FRAME_WOODEN_LATTICE)
                .setDiameter(YurtConstants.DEFAULT_NOMADIC_DIAMETER)
                .setCovering(YurtConstants.COVERING_FELT)
                .setDoorDirection(YurtConstants.DOOR_SOUTH_EAST)
                .installStove(true)
                .addDecoration("shanyrak (crown wheel) left undecorated, as tradition")
                .addDecoration("hand-woven ornamented bands (bau)")
                .setPurpose(YurtPurpose.NOMADIC)
                .build();
    }

    public Yurt constructTouristGlampingYurt(YurtBuilder builder) {
        return builder
                .setFrameType(YurtConstants.FRAME_STEEL_COLLAPSIBLE)
                .setDiameter(YurtConstants.DEFAULT_TOURIST_DIAMETER)
                .setCovering(YurtConstants.COVERING_CANVAS)
                .setDoorDirection(YurtConstants.DOOR_GLASS)
                .installStove(false)
                .addDecoration("string lighting")
                .addDecoration("panoramic roof window")
                .setPurpose(YurtPurpose.TOURIST_GLAMPING)
                .build();
    }

    public Yurt constructCeremonialWeddingYurt(YurtBuilder builder) {
        return builder
                .setFrameType(YurtConstants.FRAME_WOODEN_LATTICE)
                .setDiameter(YurtConstants.DEFAULT_CEREMONIAL_DIAMETER)
                .setCovering(YurtConstants.COVERING_DECORATIVE_SILK)
                .setDoorDirection(YurtConstants.DOOR_SOUTH_EAST)
                .installStove(true)
                .addDecoration("gold-embroidered wall hangings (tuskiyz)")
                .addDecoration("floral shyrdak floor carpets")
                .addDecoration("ceremonial entrance arch")
                .setPurpose(YurtPurpose.CEREMONIAL)
                .build();
    }
}

