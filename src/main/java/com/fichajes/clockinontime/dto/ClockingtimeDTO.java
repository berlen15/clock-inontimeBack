package com.fichajes.clockinontime.dto;

import com.fichajes.clockinontime.entity.Card;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

public class ClockingtimeDTO implements Serializable {
    private Long clockingtimeid;
    private Card card;
    private LocalTime time;

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
