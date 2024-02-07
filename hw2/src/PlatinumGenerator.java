public class PlatinumGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Создан новый сундук");
        return new PlatinumReward();

    }
}