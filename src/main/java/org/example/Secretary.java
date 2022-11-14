package org.example;

import java.util.List;

public class Secretary extends Employee {
    private List<String> meetingsList;

    public Secretary(String name, Integer salary) {
        super(name, salary);
    }

    public Secretary(Integer id, String name, Integer salary) {
        super(id, name, salary);
    }

    public Secretary(String name, Integer salary, List<String> list) {
        super(name, salary);
        this.meetingsList = list;
    }

    public Secretary(Integer id, String name, Integer salary, List<String> list) {
        super(id, name, salary);
        this.meetingsList = list;
    }

    public List<String> getMeetings() {
        return this.meetingsList;
    }

    public void addMeeting(String meeting) {
        meetingsList.add(meeting);
    }

    public void removeMeeting(String meeting) {
        meetingsList.remove(meeting);
    }

    @Override
    public String toString() {
        return "Secretary\n" + super.toString() + "Meetings: " + meetingsList;
    }
}
