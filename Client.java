public class Client {

    public static void main(String[] args) {
        YurtDirector director = new YurtDirector();

        Yurt nomadicYurt = director.constructTraditionalNomadicYurt(new ConcreteYurtBuilder());
        System.out.println("Traditional nomadic yurt:");
        System.out.println(nomadicYurt);

        Yurt touristYurt = director.constructTouristGlampingYurt(new ConcreteYurtBuilder());
        System.out.println("\nTourist glamping yurt:");
        System.out.println(touristYurt);

        Yurt ceremonialYurt = director.constructCeremonialWeddingYurt(new ConcreteYurtBuilder());
        System.out.println("\nCeremonial wedding yurt:");
        System.out.println(ceremonialYurt);

        Yurt exhibitionYurt=new ConcreteYurtBuilder()
                .setFrameType(YurtConstants.FRAME_STEEL_COLLAPSIBLE)
                .setDiameter(8)
                .setCovering(YurtConstants.COVERING_CANVAS)
                .setDoorDirection(YurtConstants.DOOR_GLASS)
                .installStove(false)
                .addDecoration("museum information plaques")
                .addDecoration("LED accent lighting")
                .setPurpose(YurtPurpose.EXHIBITION)
                .build();
        System.out.println("\nCustom exhibition yurt:");
        System.out.println(exhibitionYurt);

        System.out.println("\nAttempting to build an invalid yurt (diameter too large):");
        try {
            new ConcreteYurtBuilder()
                    .setFrameType(YurtConstants.FRAME_WOODEN_LATTICE)
                    .setDiameter(50)
                    .setCovering(YurtConstants.COVERING_FELT)
                    .setPurpose(YurtPurpose.NOMADIC)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Rejected as expected: " + e.getMessage());
        }
    }
}
