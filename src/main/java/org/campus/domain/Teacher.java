package org.campus.domain;
import lombok.Data;
import org.campus.AttendanceServiceApplication;

import javax.persistence.*;

/**
 * Created by Asif on 10/1/2016.
 */
@Data
@Entity
public class Teacher extends BaseEntity {
    @Column(name ="NAME" ,nullable = false)
    private String name;

    @Column(name="SLOT",nullable = false)
    private int slot;

    public Teacher()
    {}

    public Teacher(String name, int slot)
    {
        this.name=name;
        this.slot=slot;
    }
    @OneToOne
    @JoinColumn(name="attendance_id")
    private Attendance attendance;
}


