package com.hclaims;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MemoryClaimDatabase implements ClaimDatabase {

  Map<String, Claim> storedClaims;

  public MemoryClaimDatabase() {
    this.storedClaims = new HashMap<String, Claim>();
  }

  public Claim loadClaim(String claimId) {
    return storedClaims.get(claimId);
  }

  public String createClaim(CreateClaimRequest claimRequest) {
    String id = generateNewId();
    Claim claim = claimRequestToClaim(claimRequest, id);
    storeClaim(claim);
    return id;
  }

  private void storeClaim(Claim claim) {
    this.storedClaims.put(claim.claimId, claim);
  }

  private Claim claimRequestToClaim(CreateClaimRequest claimRequest, String id) {
    return new Claim(id, claimRequest.practiceName, claimRequest.dateOfService, claimRequest.serviceAmountInUSD);
  }

  private String generateNewId() {
    return UUID.randomUUID().toString();
  }

}
