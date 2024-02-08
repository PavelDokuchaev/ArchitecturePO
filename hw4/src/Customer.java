import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements GenerateCustomerID{
    private int id;
    private ArrayList<Ticket> tickets;
    private long cardNumber;

    private boolean isAuthorized;

    public Customer(long cardNumber) {
        id = generateCustomerId();
        this.cardNumber = cardNumber;
        tickets = new ArrayList<Ticket>();
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void buyTicket(TicketProvider ticketProvider, CreditCardRepository creditCardRepository) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Selling selling = new Selling(cardNumber, ticketProvider, creditCardRepository);
        System.out.println("Введите дату в формате 'yyyy/MM/dd' для проверки наличия билетов");
        System.out.println(ticketProvider.searchTicket(new SimpleDateFormat("yyyy/MM/dd").parse(scanner.next())));
        System.out.println("Для покупки билета введите дату в формате 'yyyy/MM/dd' и место");
        Ticket ticket = ticketProvider.createTicket(new SimpleDateFormat("yyyy/MM/dd").parse(scanner.next()), scanner.nextInt());
        if (selling.sell(ticket)) {
            tickets.add(ticket);
        }
    }
}