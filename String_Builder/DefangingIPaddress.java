package com.vishu.String_Builder;

class DefangingIPaddress {
    public static void main(String[] args) {
        String dark = "1.2.4.7";
        System.out.println(defangIPaddr(dark));
    }
    public static String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }
}