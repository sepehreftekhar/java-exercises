class BaseCar {
    private String name;
    private int year;
    private String colour;


    /*public BaseCar(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public BaseCar(boolean x, double y){

    }*/
    public BaseCar(){
        this.name = "gogoli";
    }

    public void print() {
        System.out.println("car: " + name + " | year: " + year + " | colour: " + colour);
    }
}