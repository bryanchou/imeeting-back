package fudan.se.lab2.controller.request;

public class GetMeetingAllPaperRequest {
    private String meetingFullname;

    public String getMeetingFullname() {
        return meetingFullname;
    }

    public void setMeetingFullname(String meetingFullname) {
        this.meetingFullname = meetingFullname;
    }
}
