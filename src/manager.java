public class manager extends coworker{
private String id2;
    public manager(String name,String surname,int age,String id2){
       super(name,surname,age,id2);
       this.id2=id2;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }
}
