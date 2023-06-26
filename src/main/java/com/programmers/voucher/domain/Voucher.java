package com.programmers.voucher.domain;

import com.programmers.global.exception.AmountValueException;

import java.time.LocalDate;
import java.util.UUID;

public class Voucher {

    private final UUID voucherId;
    private final Discount discount;
    private final LocalDate createdDate;

    public Voucher(UUID voucherId, Discount discount, LocalDate createdDate) {
        this.voucherId = voucherId;
        this.discount = discount;
        this.createdDate = createdDate;
    }

    public long applyDiscount(long itemPrice) {
        return discount.applyDiscount(itemPrice);
    }

    public UUID getVoucherId() {
        return voucherId;
    }

    public Discount getDiscount() {
        return discount;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
}
