package org.example;

public class Person {

        private String Name;
        private String Address;
        private String Telephone;

        public Person(){
                this.Name= "";
                this.Address = "";
                this.Telephone="";
        }



        public String getTelephone() {
                return Telephone;
        }
        public void setTelephone(String telephone) {
                Telephone = telephone;
        }
        public String getAddress() {
                return Address;
        }
        public void setAddress(String address) {
                Address = address;
        }
        public String getName() {
                return Name;
        }
        public void setName(String name) {
                Name = name;
        }




        @Override
        public String toString() {
                return "Person{" +
                        "Name='" + Name + '\'' +
                        ", Address='" + Address + '\'' +
                        ", Telephone='" + Telephone + '\'' +
                        '}';
        }



}