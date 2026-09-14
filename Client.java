public class Client {

    public static void main(String[] args) {
        YurtDirector director = new YurtDirector();

        Yurt nomadic = director.constructNomadicYurt(new YurtBuilder());
        System.out.println(nomadic);

        Yurt tourist = director.constructTouristYurt(new YurtBuilder());
        System.out.println(tourist);

        Yurt custom = new YurtBuilder()
                .setFrameType("steel frame")
                .setDiameter(8)
                .setCovering("canvas")
                .installStove(false)
                .setPurpose("CEREMONIAL")
                .build();
        System.out.println(custom);

        try {
            new YurtBuilder()
                    .setFrameType("wooden lattice frame")
                    .setDiameter(50)
                    .setCovering("felt")
                    .setPurpose("NOMADIC")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
