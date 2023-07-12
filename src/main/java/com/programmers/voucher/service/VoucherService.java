package com.programmers.voucher.service;

import com.programmers.voucher.dto.VoucherRequestDto;
import com.programmers.voucher.dto.VoucherResponseDto;

import java.util.List;
import java.util.UUID;

public interface VoucherService {

    VoucherResponseDto create(VoucherRequestDto requestDto);

    List<VoucherResponseDto> findVouchers();

    VoucherResponseDto findVoucher(UUID voucherId);
}
