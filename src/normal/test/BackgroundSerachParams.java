package normal.test;

import java.util.Arrays;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2019-10-22 21:03
 */

public class BackgroundSerachParams {
    private Long patientId;
    private Long providerid;
    private Long id;
    private String startTime;
    private String endTime;
    private String[] statuses;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getProviderid() {
        return providerid;
    }

    public void setProviderid(Long providerid) {
        this.providerid = providerid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String[] getStatuses() {
        return statuses;
    }

    public void setStatuses(String[] statuses) {
        this.statuses = statuses;
    }

    @Override
    public String toString() {
        return "BackgroundSerachParams{" +
                "patientId=" + patientId +
                ", providerid=" + providerid +
                ", id=" + id +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", statuses=" + Arrays.toString(statuses) +
                '}';
    }
}
