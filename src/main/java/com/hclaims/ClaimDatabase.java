package com.hclaims;

public interface ClaimDatabase {


  Claim loadClaim(String claimId);

  String createClaim(CreateClaimRequest claimRequest);
}
