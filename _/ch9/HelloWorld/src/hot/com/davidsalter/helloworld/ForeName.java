package com.davidsalter.helloworld;

import org.jboss.seam.annotations.Name;

@Name("foreName")
public class ForeName {

    private String name;
    private String reverse;
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReverse() {
        return reverse;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }

     public void reverse() {
        int i, len = name.length();
        StringBuffer dest = new StringBuffer(len);

        for (i = (len - 1); i >= 0; i--) {
            dest.append(name.charAt(i));
        }

        reverse = dest.toString();
    }
}
