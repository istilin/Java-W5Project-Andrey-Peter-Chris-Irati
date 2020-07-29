public class Animal {
    private String name;
    private static int tempId = 100000000;
    private int animalId;
    private String species;
    private boolean sick = false;
    private int amountFood;
    private int amountMeds;
    private int attractiveness;
    private double animalPrice;
    private boolean entertained = false;
    private double profit;
    private Zoo zoo;
    private double extraFee = 0;
    private int sickTimes = 0;
    private int vetTimes = 0;

    public Animal(String name, String species, int amountFood, int amountMeds, int attractiveness, double animalPrice, Zoo zoo){
        this.name = name;
        this.species = species;
        this.amountFood = amountFood;
        this.amountMeds = amountMeds;
        this.attractiveness = attractiveness;
        this.animalPrice = animalPrice;
        animalId = tempId;
        tempId++;
        this.zoo = zoo;
        zoo.setAnimals(animalId, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public int getAmountFood() {
        return amountFood;
    }

    public void setAmountFood(int amountFood) {
        this.amountFood = amountFood;
    }

    public int getAmountMeds() {
        return amountMeds;
    }

    public void setAmountMeds(int amountMeds) {
        this.amountMeds = amountMeds;
    }

    public int getAttractiveness() {
        return attractiveness;
    }

    public void setAttractiveness(int attractiveness) {
        this.attractiveness = attractiveness;
    }

    public double getAnimalPrice() {
        return animalPrice;
    }

    public void setAnimalPrice(double animalPrice) {
        this.animalPrice = animalPrice;
    }

    public boolean isEntertained() {
        return entertained;
    }

    public void setEntertained(boolean entertained) {
        this.entertained = entertained;
    }

    public double getProfit() {
        if (sick) {
            attractiveness -= 1;
        }
        if (entertained) {
            attractiveness += 1;
        }

        if (zoo.getVet().getAnimalsCare().containsKey(animalId) ){
            attractiveness = 0;
            extraFee = zoo.getCosts().get("VetFee");

        }
        double profitAttractiveness = zoo.getCosts().get("EntranceFee") * attractiveness;
        double costMeds = zoo.getCosts().get("MedsCost") * amountMeds;
        double costFood = zoo.getCosts().get("FoodCost") * amountFood;
        profit = profitAttractiveness - costMeds - costFood - extraFee;
        return profit;
    }

    public void feedAnimal(){
        zoo.getStock().put("AmountFood", zoo.getStock().get("AmountFood") - amountFood);
    }

    public void medicateAnimal(){
        zoo.getStock().put("AmountMeds", zoo.getStock().get("AmountMeds") - amountMeds);
    }

    public void entertainAnimal(){
        entertained = true;
    }

    public void setSickTimes(int sickTimes) {
        this.sickTimes = sickTimes;
    }

    public void setVetTimes(int vetTimes) {
        this.vetTimes = vetTimes;
    }

    public int getSickTimes() {
        return sickTimes;
    }

    public int getVetTimes() {
        return vetTimes;
    }

    @Override
    public String toString() {
        return   "animalId=" + animalId +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", amountFood=" + amountFood +
                ", amountMeds=" + amountMeds +
                ", attractiveness=" + attractiveness
                ;
    }
}
