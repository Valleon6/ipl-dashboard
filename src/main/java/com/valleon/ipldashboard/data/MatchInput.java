package com.valleon.ipldashboard.data;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchInput {
    private String id;
    private String inning;
    private String over;
    private String ball;
    private String batsman;
    private String non_striker;
    private String bowler;
    private String batsman_runs;
    private String extra_runs;
    private String total_runs;
    private String non_boundary;
    private String is_wicket;
    private String dismissal_kind;
    private String player_dismissed;
    private String fielder;
    private String extras_type;
    private String batting_team;
    private String bowling_team;



}
