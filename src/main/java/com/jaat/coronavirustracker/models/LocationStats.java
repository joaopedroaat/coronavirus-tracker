package com.jaat.coronavirustracker.models;

/**
 * LocationStats
 */
public class LocationStats {

  private String state;
  private String country;
  private int latestTotalCases;
  private int diffFromPrevDay;

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }
  
  public String getCountry() {
    return this.country;
  }
  
  public void setCountry(String country) {
    this.country = country;
  }
  
  public int getLatestTotalCases() {
    return this.latestTotalCases;
  }
  
  public void setLatestTotalCases(int latestTotalCases) {
    this.latestTotalCases = latestTotalCases;
  }
  
  public int getDiffFromPrevDay() {
    return this.diffFromPrevDay;
  }

  public void setDiffFromPrevDay(int diffFromPrevDay) {
    this.diffFromPrevDay = diffFromPrevDay;
  }

  @Override
  public String toString() {
    return "{" +
    " state='" + state + "'" +
    ", country='" + country + "'" +
    ", latestTotalCases='" + latestTotalCases + "'" +
    "}";
  }
  
}