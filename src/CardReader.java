public class CardReader implements Usb{
    MevoryCard memoryCard;

    public CardReader(MevoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }
    public void connectionWithUsb(){
        memoryCard.insert() ;
        memoryCard.copyData();
        memoryCard.remove();
    }
}
