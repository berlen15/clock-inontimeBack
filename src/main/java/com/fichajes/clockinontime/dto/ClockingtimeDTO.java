package com.fichajes.clockinontime.dto;

import com.fichajes.clockinontime.entity.Card;

import java.io.Serializable;
import java.util.Date;

public class ClockingtimeDTO implements Serializable {
    private Long clockingtimeid;
    private Card card;
    private Date date;

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
