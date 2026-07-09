package com.collection.Standalone;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String> friends;
    private Map<String , Integer> course_fees;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getCourse_fees() {
        return course_fees;
    }

    public void setCourse_fees(Map<String, Integer> course_fees) {
        this.course_fees = course_fees;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", course_fees=" + course_fees +
                '}';
    }
}
