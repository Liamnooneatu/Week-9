package org.example;

public class Customer extends Person {
    public Customer(){
    }
    private String custNo;
    private boolean mailingList;

    public Customer(String Name, String Address,String Phone,String custNo,boolean mailingList) {
        super(Name,Address,Phone);
        this.custNo = custNo;
        this.mailingList = mailingList;
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

//super toString() required.
    @Override
    public String toString() {
        return "Customer{" + super.toString() + "custNo='" + custNo + '\'' +", mailingList=" + mailingList +
                '}';
    }
}
