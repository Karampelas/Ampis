public class Item{
    private int year;
    private String company;
    private String category;

    public  Item(int year, String company, String category) {
        this.year = year;
        this.company = company;
        this.category = category;
    }
    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }
    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }
    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return "\nYear of production: "+this.getYear()+"\nCompany: "+this.getCompany()+"\nCategory: "+this.getCategory();
    }
}
