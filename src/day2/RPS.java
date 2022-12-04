package day2;

public enum RPS {
    A(1),
    B(2),
    C(3),
    X(1),
    Y(2),
    Z(3);

    public final Integer value;

    RPS(Integer value) {
        this.value = value;
    }
}
