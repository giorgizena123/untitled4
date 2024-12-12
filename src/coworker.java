public class coworker extends human {
    private String id;


    public coworker(String name, String surname, int age,String id){
        super(surname,name,age);
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
