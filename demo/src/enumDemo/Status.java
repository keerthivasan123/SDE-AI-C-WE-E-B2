package enumDemo;

public enum Status {
    SUCCESS(200),
    ERROR(500);

    private final int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Status{" +
                "name='" + name() + '\'' +
                "code=" + code +
                '}';
    }
}

