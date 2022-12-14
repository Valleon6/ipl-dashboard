package com.valleon.ipldashboard.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Match {
    @Id
    private Long id;
    private String city;
    private LocalDate date;
    private String playerOfMatch;
    private String venue;
    private String neutral_venue;
    private String team1;
    private String team2;
    private String tossWinner;
    private String tossDecision;
    private String matchWinner;
    private String result;
    private String resultMargin;
    private String umpire1;
    private String umpire2;
}
