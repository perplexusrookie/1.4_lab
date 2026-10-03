public class TicketBoothTester {
    public static void main(String[] args) {
        TicketBooth matinee = new TicketBooth("Dune", 14, 12);
        TicketBooth evening = new TicketBooth("Heat", 19, 40);

        // Uncomment each group as you finish that method.

        System.out.println("seats left: " + matinee.getSeatsLeft());

        System.out.println("priceCategory(12): " + evening.priceCategory(12));
        System.out.println("priceCategory(13): " + evening.priceCategory(13));
        System.out.println("priceCategory(18): " + evening.priceCategory(18));
        System.out.println("priceCategory(65): " + evening.priceCategory(65));

        System.out.println("evening ticketPrice(8, false): "
                + evening.ticketPrice(8, false));
        System.out.println("evening ticketPrice(8, true): "
                + evening.ticketPrice(8, true));
        System.out.println("matinee ticketPrice(8, false): "
                + matinee.ticketPrice(8, false));
        System.out.println("matinee ticketPrice(8, true): "
                + matinee.ticketPrice(8, true));
        
        System.out.println("matinee ticketPrice(15, false): "
                + matinee.ticketPrice(15, false));
        System.out.println("matinee ticketPrice(15, true): "
                + matinee.ticketPrice(15, true));
        System.out.println("evening ticketPrice(15, false): "
                + evening.ticketPrice(15, false));
         System.out.println("evening ticketPrice(15, true): "
                + evening.ticketPrice(15, true));
                
        System.out.println("matinee ticketPrice(20, false): "
                + matinee.ticketPrice(20, false));
        System.out.println("matinee ticketPrice(20, true): "
                + matinee.ticketPrice(20, true));
        System.out.println("evening ticketPrice(20, false): "
                + evening.ticketPrice(20, false));
        System.out.println("evening ticketPrice(20, true): "
                + evening.ticketPrice(20, true));

        System.out.println("matinee ticketPrice(70, false): "
                + matinee.ticketPrice(70, false));
        System.out.println("matinee ticketPrice(70, true): "
                + matinee.ticketPrice(70, true));
        System.out.println("evening ticketPrice(70, false): "
                + evening.ticketPrice(70, false));
        System.out.println("evening ticketPrice(70, true): "
                + evening.ticketPrice(70, true));

        // Finish the constructor first. Then each call below shows
        // its method's bug. Run it before you fix anything.

        //added the upper barrier to matinee shows (16:00)
        System.out.println("evening showtimeLabel(): " + evening.showtimeLabel());
        // changed if to else if
        System.out.println("wristband(10): " + evening.wristband(10));
        // compared to true instead of assigning
        System.out.println("memberDiscount(false): " + evening.memberDiscount(false));

        // Uncomment each group as you finish that method.

        matinee.setShowHour(9);
        System.out.println("after setShowHour(9): " + matinee.getShowHour());
        matinee.setShowHour(10);
        System.out.println("after setShowHour(10): " + matinee.getShowHour());
        matinee.setShowHour(24);
        System.out.println("after setShowHour(24): "+ matinee.getShowHour());

        // matinee.sell(13);
        // System.out.println("after sell(13): " + matinee.getSeatsLeft());
    }
}