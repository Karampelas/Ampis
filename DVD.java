public class DVD extends Item{

    private String name;
    private String director;
    private String author;
    private String actor;
    private String type;

    public  DVD(String name,int year, String company, String category, String director, String author, String actor, String type) {
        super(year, company, category);
        this.name = name;
        this.director = director;
        this.author = author;
        this.actor = actor;
        this.type = type;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }
    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }
    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }
    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * @return the actor
     */
    public String getActor() {
        return actor;
    }
    /**
     * @param actor the actor to set
     */
    public void setActor(String actor) {
        this.actor = actor;
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
    @Override
    public String toString() {
        return "Name: "+this.getName()+super.toString()+"\nDirector: "+this.getDirector()+"\nAuthor: "+this.getAuthor()+"\nActor: "+this.getActor()+"\nType of DVD: "+this.getType();
    }
}