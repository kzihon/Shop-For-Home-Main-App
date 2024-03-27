package com.api.server.coupon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

//  @Id
//  @GeneratedValue
  private Long id;
  private String couponName;
  private String code;
  private double discount;
  private boolean active;

  public Coupon(String couponName, String code, double discount, boolean active) {
    this.couponName = couponName;
    this.code = code;
    this.discount = discount;
    this.active = active;
  }
}