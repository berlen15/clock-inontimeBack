package com.fichajes.clockinontime.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="card")
public class Card implements Serializable {
    @Id
    @Column(name="card_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardid;

    @Column(name="date")
    private Date dateCard;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "card")
    private List<ClockingTime> times;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public Card(){}

    public Card(Long cardid, List<ClockingTime> times, User user) {
        this.cardid = cardid;
        this.times = times;
        this.user = user;
    }

    public Long getCardid() {
        return cardid;
    }

    public void setCardid(Long cardid) {
        this.cardid = cardid;
    }

    public List<ClockingTime> getTimes() {
        return times;
    }

    public void setTimes(List<ClockingTime> times) {
        this.times = times;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateCard() {
        return dateCard;
    }

    public void setDateCard(Date dateCard) {
        this.dateCard = dateCard;
    }
}

