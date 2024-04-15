package cn.edu.nwpu.software.strik0r.TaskManagement.Task;

import java.util.GregorianCalendar;

/**
 * @author Strik0r
 * {@code Task} 类是个人事务管理系统中的 “任务” 的所在类
 * */
public class Task {
    private int id; // 任务的序列号
    private String description; // 简单描述
    private GregorianCalendar deadline; // 截止时间
    private GregorianCalendar arrangement; // 安排时间 (计划去完成它的时间)
    private String info;

    // getter & setter
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public GregorianCalendar getDeadline() {
        return deadline;
    }
    public void setDeadline(GregorianCalendar deadline) {
        this.deadline = deadline;
    }
    public GregorianCalendar getArrangement() {
        return arrangement;
    }
    public void setArrangement(GregorianCalendar arrangement) {
        this.arrangement = arrangement;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
