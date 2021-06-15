package com.fichajes.clockinontime.dto;


import com.fichajes.clockinontime.entity.User;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CardDTO implements Serializable {
    private Long cardid;
    private List<ClockingtimeDTO> times;
    private Date dateCard;
    private User user;

    public Long getCardid() {
        return cardid;
    }

    public void setCardid(Long cardid) {
        this.cardid = cardid;
    }

    public List<ClockingtimeDTO> getTimes() {
        return times;
    }

    public void setTimes(List<ClockingtimeDTO> times) {
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
