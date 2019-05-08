public class Games extends Item {
    private String name;
    private String console;

    public Games(String name, int year, String company, String category, String console) {
        super(year, company, category);
        this.name = name;
        this.console = console;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }/**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the console
     */
    public String getConsole() {
        return console;
    }/**
     * @param console the console to set
     */
    public void setConsole(String console) {
        this.console = console;
    }
    @Override
    public String toString() {
        return "Name: "+this.getName() + super.toString()+"\nConsole: "+this.getConsole();
    }
}
