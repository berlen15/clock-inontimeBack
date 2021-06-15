package com.fichajes.clockinontime.entity;

import javax.persistence.*;
import java.io.Serializable;
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
    private Date date;

    public ClockingTime(Long clockingtimeid, Card card, Date date) {
        this.clockingtimeid = clockingtimeid;
        this.card = card;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
