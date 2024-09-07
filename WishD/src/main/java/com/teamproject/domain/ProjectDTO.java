package com.teamproject.domain;


import java.sql.Timestamp;
import java.util.List;

public class ProjectDTO {

    private Long pboard_id;
    private Long user_id;
    private String pboard_title;
    private String pboard_content;
    private int pboard_money;
    private String pboard_startdate;
    private int pboard_rangemonth;
    private String pboard_job;
    private String pboard_state;
    private Timestamp pboard_date;
    private Timestamp pboard_update;

    //skill String 으로 가져와서 배열로 나누는 값
    private String skillList;

    //pboard_id 값에 따른 skill 등록한것 가져오기
    private List<ProjectSkillDTO> skills;


    public String getSkillList() {
        return skillList;
    }

    public void setSkillList(String skillList) {
        this.skillList = skillList;
    }

    public Long getPboard_id() {
        return pboard_id;
    }

    public void setPboard_id(Long pboard_id) {
        this.pboard_id = pboard_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getPboard_title() {
        return pboard_title;
    }

    public void setPboard_title(String pboard_title) {
        this.pboard_title = pboard_title;
    }

    public String getPboard_content() {
        return pboard_content;
    }

    public void setPboard_content(String pboard_content) {
        this.pboard_content = pboard_content;
    }

    public int getPboard_money() {
        return pboard_money;
    }

    public void setPboard_money(int pboard_money) {
        this.pboard_money = pboard_money;
    }

    public String getPboard_startdate() {
        return pboard_startdate;
    }

    public void setPboard_startdate(String pboard_startdate) {
        this.pboard_startdate = pboard_startdate;
    }

    public int getPboard_rangemonth() {
        return pboard_rangemonth;
    }

    public void setPboard_rangemonth(int pboard_rangemonth) {
        this.pboard_rangemonth = pboard_rangemonth;
    }

    public String getPboard_job() {
        return pboard_job;
    }

    public void setPboard_job(String pboard_job) {
        this.pboard_job = pboard_job;
    }

    public String getPboard_state() {
        return pboard_state;
    }

    public void setPboard_state(String pboard_state) {
        this.pboard_state = pboard_state;
    }

    public Timestamp getPboard_date() {
        return pboard_date;
    }

    public void setPboard_date(Timestamp pboard_date) {
        this.pboard_date = pboard_date;
    }

    public Timestamp getPboard_update() {
        return pboard_update;
    }

    public void setPboard_update(Timestamp pboard_update) {
        this.pboard_update = pboard_update;
    }

    public List<ProjectSkillDTO> getSkills() {
        return skills;
    }
    public void setSkills(List<ProjectSkillDTO> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "ProjectDTO{" +
                "pboard_id=" + pboard_id +
                ", user_id=" + user_id +
                ", pboard_title='" + pboard_title + '\'' +
                ", pboard_content='" + pboard_content + '\'' +
                ", pboard_money=" + pboard_money +
                ", pboard_startDate='" + pboard_startdate + '\'' +
                ", pboard_rangeMonth=" + pboard_rangemonth +
                ", pboard_job='" + pboard_job + '\'' +
                ", pboard_state='" + pboard_state + '\'' +
                ", pboard_date=" + pboard_date +
                ", pboard_update=" + pboard_update +
                ", skillList='" + skillList + '\'' +
                '}';
    }
}
