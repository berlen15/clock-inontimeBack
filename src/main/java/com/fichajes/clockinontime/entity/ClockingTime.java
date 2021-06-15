package com.fichajes.clockinontime.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name="clockingtime")
public class ClockingTime implements Serializable {
    @Id
    @Column(name="clockingtime_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clockingtimeid;

    @ManyToOne
    @JoinColumn ( name = "card_id", nullable = false)
    private Card card;

    @Column(name="time")
    private LocalTime time;

    public ClockingTime(Long clockingtimeid, Card card, LocalTime time) {
        this.clockingtimeid = clockingtimeid;
        this.card = card;
        this.time = time;
    }

    public Long getClockingtimeid() {
        return clockingtimeid;
    }

    public void setClockingtimeid(Long clockingtimeid) {
        this.clockingtimeid = clockingtimeid;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
