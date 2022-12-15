package emlakcepte.model;

public class Address {

    private String province;
    private String district;
    private String street;
    private String doorNumber;

    public Address() {
    }

    public Address(String province, String district, String street, String doorNumber) {
        this.province = province;
        this.district = district;
        this.street = street;
        this.doorNumber = doorNumber;
    }

    public Address(String province, String district) {
        this.province = province;
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", doorNumber='" + doorNumber + '\'' +
                '}';
    }
}
