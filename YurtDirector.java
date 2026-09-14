package yurtbuilder;

public class YurtDirector {

    public Yurt constructNomadicYurt(YurtBuilder builder) {
        return builder
                .setFrameType("wooden lattice frame")
                .setDiameter(6)
                .setCovering("felt")
                .installStove(true)
                .setPurpose("NOMADIC")
                .build();
    }

    public Yurt constructTouristYurt(YurtBuilder builder) {
        return builder
                .setFrameType("steel frame")
                .setDiameter(5)
                .setCovering("canvas")
                .installStove(false)
                .setPurpose("TOURIST")
                .build();
    }
}
