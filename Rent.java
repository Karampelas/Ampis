public class Rent{
    int i = 0;
    double cost_per_day = 1.12;
    double cost_per_week = 6.23;
    private int serial_number;
    private Item dvd_game;
    private String name_surename;
    private String phone_number;
    private int dd;
    private int mm;
    private int yyyy;
    private int days;
    private boolean flag;
    private String type;

    public Rent(){}

    public  Rent(Item dvd_game, String name_surename, String phone_number,int dd, int mm, int yyyy, int days) {
        i++;
        this.serial_number = i;
        this.dvd_game = dvd_game;
        this.name_surename = name_surename;
        this.phone_number = phone_number;
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
        this.flag = false;
        this.type = type;
    }
    /**
     * @return the dd
     */
    public int getDd() {
        return dd;
    }
    /**
     * @param dd the dd to set
     */
    public void setDd(int dd) {
        this.dd = dd;
    }
    /**
     * @return the mm
     */
    public int getMm() {
        return mm;
    }
    /**
     * @param mm the mm to set
     */
    public void setMm(int mm) {
        this.mm = mm;
    }
    /**
     * @return the yyyy
     */
    public int getYyyy() {
        return yyyy;
    }
    /**
     * @param yyyy the yyyy to set
     */
    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }
    /**
     * @return the name_surename
     */
    public String getName_surename() {
        return name_surename;
    }
    /**
     * @param name_surename the name_surename to set
     */
    public void setName_surename(String name_surename) {
        this.name_surename = name_surename;
    }
    /**
     * @return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }
    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    /**
     * @return the serial_number
     */
    public int getSerial_number() {
        return serial_number;
    }
    /**
     * @param serial_number the serial_number to set
     */
    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }
    /**
     * @return the days
     */
    public int getDays() {
        return days;
    }
    /**
     * @param days the days to set
     */
    public void setDays(int days) {
        this.days = days;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    public double getCost(){
        if (this.type.equals("DVD")) {
            return (days*cost_per_day);         
        } 
        else return 0;

    }
    @Override
    public String toString() {
        return "malaakaaaaaaaaa";
    }
}