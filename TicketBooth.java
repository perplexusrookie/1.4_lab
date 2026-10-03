public class TicketBooth {

    private String showName;
    private int showHour;
    private int seatsLeft;

    // Read REQ 02
    public TicketBooth(String newShowName, int newShowHour, int newSeatsLeft) {
        this.showName = newShowName;
        this.showHour = newShowHour;
        this.seatsLeft = newSeatsLeft;
    }

    // Read REQ 02
    public String getShowName() {
        return showName;
    }

    // Read REQ 02
    public int getShowHour() {
        return showHour;
    }

    // Read REQ 02
    public int getSeatsLeft() {
        return seatsLeft;
    }

    // ---------- Write these methods ----------

    // Read REQ 03
    public String priceCategory(int age) {
        if (age <= 12){
            return "child";
        } else if (age <= 17){
            return "student";
        } else if (age <= 64){
            return "adult";
        } else {
            return "senior";
        }
    }

    // Read REQ 04
    public int ticketPrice(int age, boolean isMember) {
        int price;
        if (age <= 12){
            price = 8;
        } else if (age <= 17){
            price = 12;
        } else if (age <= 64){
            price = 18;
        } else {
            price = 10;
        }
        if (showHour >= 12 && showHour <= 16 && age >= 13 && age <= 64){
            price -= 3;
        }
        if (isMember){
            price -=2;
        }
        return price;
    }

    // ---------- Each method below compiles and has exactly one bug ----------

    // Read REQ 05
    public String showtimeLabel() {
        if (showHour >= 12 && showHour <= 16) {
            return "matinee";
        } else if (showHour >= 17) {
            return "evening";
        } else {
            return "morning";
        }
    }

    // Read REQ 06
    public String wristband(int age) {
        String color = "green";
        if (age <= 12) {
            color = "red";
        }
        else if (age <= 17) {
            color = "yellow";
        }
        return color;
    }

    // Read REQ 07
    public int memberDiscount(boolean isMember) {
        if (isMember) {
            return 2;
        }
        return 0;
    }

    // ---------- Write these with guard clauses ----------

    // Read REQ 08
    public void setShowHour(int newShowHour) {
        if (newShowHour < 10 || newShowHour > 23){
            System.out.println("Invalid show hour: "+newShowHour);
            return;
        }
        showHour = newShowHour;
    }

    // Read REQ 09
    public void setSeatsLeft(int newSeatsLeft) {
        if (newSeatsLeft < 0 || newSeatsLeft > 200){
            System.out.println("Invalid seat count:"+newSeatsLeft);
            return;
        }
        seatsLeft = newSeatsLeft
    }

    // Read REQ 10
    public void setShowName(String newShowName) {
    }

    // Read REQ 11
    public void sell(int groupSize) {
    }
}