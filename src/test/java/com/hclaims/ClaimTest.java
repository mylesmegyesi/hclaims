package com.hclaims;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ClaimTest {

  @Test
  public void testBuildClaimWithId() {
    Claim claim = new Claim().withClaimId("abc");
    assertEquals("abc", claim.claimId);
  }

  @Test
  public void testBuildClaimWithPracticeName() {
    Claim claim = new Claim().withPracticeName("Some practice");
    assertEquals("Some practice", claim.practiceName);
  }

  @Test
  public void testBuildClaimWithServiceDate() {
    Claim claim = new Claim().withDateOfService(LocalDate.of(2014, 1, 1));
    assertEquals(LocalDate.of(2014, 1, 1), claim.dateOfService);
  }

  @Test
  public void testBuildClaimWithServiceAmount() {
    Claim claim = new Claim().withServiceAmountInUSD(new Float(140.00));
    assertEquals(new Float(140.00), claim.serviceAmountInUSD);
  }
}
