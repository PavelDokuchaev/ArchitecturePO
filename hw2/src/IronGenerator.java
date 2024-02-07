public class IronGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Создан новый сундук");
        return new IronReward();
    }
}