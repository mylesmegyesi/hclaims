package com.hclaims;

import java.time.LocalDate;

public class Claim {
  public final String claimId;
  public final String practiceName;
  public final LocalDate dateOfService;
  public final Float serviceAmountInUSD;

  public Claim() {
    practiceName = null;
    dateOfService = null;
    serviceAmountInUSD = null;
    claimId = null;
  }

  public Claim(String claimId, String practiceName, LocalDate dateOfService, Float serviceAmountInUSD) {
    this.claimId = claimId;
    this.practiceName = practiceName;
    this.dateOfService = dateOfService;
    this.serviceAmountInUSD = serviceAmountInUSD;
  }

  public Claim withClaimId(String claimId) {
    return new Claim(claimId, practiceName, dateOfService, serviceAmountInUSD);
  }

  public Claim withPracticeName(String practiceName) {
    return new Claim(claimId, practiceName, dateOfService, serviceAmountInUSD);
  }

  public Claim withDateOfService(LocalDate dateOfService) {
    return new Claim(claimId, practiceName, dateOfService, serviceAmountInUSD);
  }

  public Claim withServiceAmountInUSD(Float serviceAmountInUSD) {
    return new Claim(claimId, practiceName, dateOfService, serviceAmountInUSD);
  }
}
