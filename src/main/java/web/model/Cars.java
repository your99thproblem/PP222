package web.model;

public class Cars {
    private int dateOfManufacture;
    private String carBrand;
    private boolean pledge;

    public Cars(int dateOfManufacture, String carBrand, boolean pledge) {
        this.dateOfManufacture = dateOfManufacture;
        this.carBrand = carBrand;
        this.pledge = pledge;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public boolean isPledge() {
        return pledge;
    }

    public void setPledge(boolean pledge) {
        this.pledge = pledge;
    }

}
