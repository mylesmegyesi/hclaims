package com.hclaims;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ClaimDatabaseTest {

  private ClaimDatabase claimDatabase;

  @Before
  public void resetClaimDatabase() {
    this.claimDatabase = new MemoryClaimDatabase();
  }

  @Test
  public void createsASimpleClaim() {
    String practiceName = "Heath care practice";
    LocalDate dateOfService = LocalDate.of(2014, 7, 16);
    Float serviceAmountInUSD = new Float(335.00);
    CreateClaimRequest claimRequest = new CreateClaimRequest()
                                        .withPracticeName(practiceName)
                                        .withDateOfService(dateOfService)
                                        .withServiceAmountInUSD(serviceAmountInUSD);

    String claimId = claimDatabase.createClaim(claimRequest);
    Claim createdClaim = claimDatabase.loadClaim(claimId);


    assertEquals(claimId, createdClaim.claimId);
    assertEquals(practiceName, createdClaim.practiceName);
    assertEquals(dateOfService, createdClaim.dateOfService);
    assertEquals(serviceAmountInUSD, createdClaim.serviceAmountInUSD);
  }
}
