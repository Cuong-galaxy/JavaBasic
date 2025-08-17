package Enum;

public enum PizzaStatus {
    DAT_HANG(3),
    CHUAN_BI(4),
    GIAO_HANG(10);
    final int thoiGian;

    PizzaStatus(int thoiGian) {
        this.thoiGian = thoiGian;
    }
}

