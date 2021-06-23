package com.srm.cjava.wk01.day02;

public class EbBill {
    int consumerNo;
    String consumerName;
    int previousReading;
    int currentReading;
    String ebType;
    int unit;
    double bill;
    double cost;

    public EbBill(int consumerNo, String consumerName, int previousReading, int currentReading, String type) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.ebType = type;
    }
    public int getConsumerNo() {
        return consumerNo;
    }

    public void setConsumerNo(int consumerNo) {
        this.consumerNo = consumerNo;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public int getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(int previousReading) {
        this.previousReading = previousReading;
    }

    public int getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(int currentReading) {
        this.currentReading = currentReading;
    }

    public String getEbType() {
        return ebType;
    }

    public void setEbType(String ebType) {
        this.ebType = ebType;
    }

    @Override
    public String toString() {
        return "EbBill [consumerName=" + consumerName + ", consumerNo=" + consumerNo +  ",previousReading=" + previousReading+", currentReading="
        + currentReading + "ebType=" + ebType +  "]";
    }

    public void genBill() {
        if (this.currentReading > this.previousReading) {
            this.unit = this.currentReading  - this.previousReading;

            if (this.ebType.equalsIgnoreCase("domastic")) {
                this.cost = domasticBill(this.unit);
            } else if (this.ebType.equalsIgnoreCase("commercial")) {
                this.cost = commercialBill(this.unit);
            }
            else {
                System.out.println("Error!");
            }
        }
    }

    public double domasticBill(int unit) {
        this.unit = (previousReading - currentReading);
        if (unit <= 100) {
            return (1 * unit);
        } else if (unit >= 101 && unit <= 200) {
            return (2.50 * unit);
        } else if (unit >= 201 && unit <= 500) {
            return (4 * unit);
        } else {
            return (6 * unit);
        }
    }

    public double commercialBill(int unit) {
        this.unit = (previousReading - currentReading);
        if (unit <= 100) {
            return (2 * unit);
        } else if (unit >= 101 && unit <= 200) {
            return (4.50 * unit);
        } else if (unit >= 201 && unit <= 500) {
            return (6 * unit);
        } else {
            return (7 * unit);
        }
    }

    public void displayBill() {
        System.out.println(
                "Consumer [Customer No=" + consumerNo + ", Customer name=" + consumerName + ", Previous Reading="
                        + previousReading + ", Current Reading=" + currentReading + ", Electricity Connection type="
                        + ebType + ", Unit used for this month=" + this.unit + ", Bill Amount=" + this.cost + "]");
    }

}
