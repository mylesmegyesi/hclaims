package com.hclaims;

import java.time.LocalDate;

public class CreateClaimRequest {
  public final String practiceName;
  public final LocalDate dateOfService;
  public final Float serviceAmountInUSD;

  public CreateClaimRequest withPracticeName(String practiceName) {
    return new CreateClaimRequest(practiceName, dateOfService, serviceAmountInUSD);
  }

  public CreateClaimRequest withDateOfService(LocalDate dateOfService) {
    return new CreateClaimRequest(practiceName, dateOfService, serviceAmountInUSD);
  }

  public CreateClaimRequest withServiceAmountInUSD(Float serviceAmountInUSD) {
    return new CreateClaimRequest(practiceName, dateOfService, serviceAmountInUSD);
  }

  public CreateClaimRequest() {
    this.practiceName = null;
    this.dateOfService = null;
    this.serviceAmountInUSD = null;
  }

  private CreateClaimRequest(String practiceName, LocalDate dateOfService, Float serviceAmountInUSD) {
    this.practiceName = practiceName;
    this.dateOfService = dateOfService;
    this.serviceAmountInUSD = serviceAmountInUSD;
  }
}
