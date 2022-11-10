class Name {
    private String val;

    public String getName(){
        return val;
    }
    public void setName(String newName){
        this.val = newName;
    }
    public Name(String newName){
        setName(newName);
    }
}
