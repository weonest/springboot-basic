package com.programmers.voucher.domain;

import java.util.Arrays;

public enum VoucherType {
    FIXED("1"),
    PERCENT("2");

    private static final String WRONG_COMMAND_MESSAGE = "[ERROR] 잘못된 커맨드입니다. 올바른 커맨드를 입력해 주세요. ";
    private final String command;

    VoucherType(String command) {
        this.command = command;
    }

    public static VoucherType of(String command) {
        return Arrays.stream(VoucherType.values())
                .filter(voucherType -> voucherType.command.equals(command))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(WRONG_COMMAND_MESSAGE));
    }
}
