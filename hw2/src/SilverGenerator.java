public class SilverGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Создан новый ящик");
        return new SilverReward();
    }
}