package org.example;

public class Customer extends Person {
    public Customer(){
    }

    private String custNo;
    private boolean mailingList;

    public Customer(String custNo) {
        super(Name,Address,Phone)
        this.custNo = custNo;
        this.mailingList
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custNo='" + custNo + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
