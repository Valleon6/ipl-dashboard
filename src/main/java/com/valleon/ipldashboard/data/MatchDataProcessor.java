package com.valleon.ipldashboard.data;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import com.valleon.ipldashboard.model.Match;


public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

  private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

  @Override
  public Match process(final MatchInput matchInput) throws Exception {

    Match match = new Match();

    match.setId(matchInput.getId());
    match.setCity(matchInput.getCity());

    match.setDate(LocalDate.parse(matchInput.get);


    return match;
  }

}
